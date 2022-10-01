package cn.zhuyee.method_reference;

/**
 * <h2>使用Runnable接口的方法引用</h2>
 *
 * Created by zhuye on 2022/9/26 23:45.
 */
public class RunnableMethodReference {
  public static void main(String[] args) {

    new Thread(new Runnable() {             // [1] 通过匿名内部类方式，需要提供 run() 方法
      @Override
      public void run() {
        System.out.println("Anonymous");
      }
    }).start();

    new Thread(
        () -> System.out.println("lambda")  // [2] 通过 lambda 方式
    ).start();

    new Thread(Go::go).start();             // [3] 通过方法引用

    /**
     * 输出：
     * Anonymous
     * lambda
     * Go::go()
     */
  }
}

class Go{
  static void go() {
    System.out.println("Go::go()");
  }
}
