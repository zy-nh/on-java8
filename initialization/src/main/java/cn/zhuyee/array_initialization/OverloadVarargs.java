package cn.zhuyee.array_initialization;

/**
 * <h2>可变参数列表使重载过程变得复杂</h2>
 * <li>根据经验，应该只在一个重载方法上使用可变参数列表</li>
 * <br>
 * Created by zhuye at 2022/10/16 16:11.
 */
public class OverloadVarargs {
  static void f(Character... args) {
    System.out.print("first");
    for (Character c : args) {
      System.out.println(" " + c);
    }
    System.out.println();
  }
  static void f(Integer... args) {
    System.out.print("second");
    for (Integer i : args) {
      System.out.println(" " + i);
    }
    System.out.println();
  }

  static void f(Long... args) {
    System.out.println("third");
  }

  public static void main(String[] args) {
    f('a', 'b', 'c');
    f(1);
    f(2, 1);
    f(0);
    f(0L);
    // f();  // 无法编译，有歧义。因为重载了f()方法，当不使用参数时，编译器不知道调用哪一个了。
    // 可以通过给方法添加一个非可变参数来解决这个问题。
  }
}
