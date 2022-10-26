package cn.zhuyee.method_overload;

/**
 * <h2>如何区分重载的方法</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/8 22:58.
 */
public class OverloadingOrder {
  static void f(String s, int i) {
    System.out.println("String: " + s + ", int: " + i);
  }
  static void f(int i, String s) {
    System.out.println("int: " + i + ", String: " + s);
  }

  public static void main(String[] args) {
    f("String first", 88);
    f(99, "int first");
  }
}
