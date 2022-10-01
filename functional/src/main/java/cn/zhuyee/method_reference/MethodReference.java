package cn.zhuyee.method_reference;

/**
 * <h2>方法引用：类名|对象名::方法名</h2>
 *
 * Created by zhuye on 2022/9/26 23:16.
 */
public class MethodReference {

  static void hello(String name) {               // [3] hello() 的签名（参数类型和返回值）与 Callable#call() 的签名一致
    System.out.println("Hello " + name);
  }

  static class Description{
    String about;

    Description(String desc) {
      about = desc;
    }

    void help(String msg) {                      // [4] help() 是静态内部类中的一个非静态方法
      System.out.println(about + " " + msg);
    }
  }

  static class Helper{
    static void assist(String msg) {             // [5] help() 是静态内部类中的一个静态方法
      System.out.println(msg);
    }
  }

  public static void main(String[] args) {
    // Callable callable1 = Describe::show;      // 这里 Describe 中的 show 为普通方法，故 Describe::show 是一个未绑定方法引用，直接写编译器报错，需要像下面这样创建一个对象
    Describe describe = new Describe();
    Callable callable = describe::show;          // [6] 将 Describe 对象的一个方法引用 赋值给了一个 Callable，因为方法引用的签名与 Callable 中 call() 方法一致
    callable.call("call()");                  // [7] 可以通过 call() 来调用 show()，因为 Java 将 call() 映射到 show() 上了

    callable = MethodReference::hello;           // [8] 这是一个静态方法引用
    callable.call("Bob");

    callable = new Description("valuable")::help;// [9] 这是 [6] 的另一个版本：对某个活跃对象上的方法的方法引用，也叫 绑定方法引用
    callable.call("information");

    callable = Helper::assist;                   // [10] 获得静态内部类中的静态方法的方法引用
    callable.call("Help!");

  }

}
