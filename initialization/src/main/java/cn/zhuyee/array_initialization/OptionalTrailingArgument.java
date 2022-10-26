package cn.zhuyee.array_initialization;

/**
 * <h2>0参数传递给可变参数列表</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 15:53.
 */
public class OptionalTrailingArgument {
  static void f(int required, String... trailing) {
    System.out.print("required: " + required + " ");
    for (String s : trailing) {
      System.out.print(s + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    f(1, "one");
    f(2, "two", "three");
    f(0);
  }
}
