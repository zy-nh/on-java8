package cn.zhuyee.array_initialization;

/**
 * <h2>可变列表参数与自动装箱机制</h2>
 * <li>使用可变参数列表不依赖于自动装箱</li>
 * <br>
 * Created by zhuye at 2022/10/16 16:07.
 */
public class AutoboxingVarargs {
  public static void f(Integer... args) {
    for (Integer i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    f(1, 2);
    f(4, 5, 6, 7, 8);
    f(9, 10, 11, 12);
  }
}
