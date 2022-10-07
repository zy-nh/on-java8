package cn.zhuyee.create;

import static java.util.stream.IntStream.range;

/**
 * <h2>工具类：为了取代简单的for循环</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/2 0:16.
 */
public class Repeat {
  /**
   * 取代简单的 for 循环工具
   * @param n 循环次数
   * @param action 执行
   */
  public static void repeat(int n, Runnable action) {
    range(0, n).forEach(i -> action.run());
  }
}
