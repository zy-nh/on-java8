package cn.zhuyee.create;

import static cn.zhuyee.create.Repeat.repeat;

/**
 * <h2>测试我们简化过的 for 循环工具：{@link Repeat#repeat(int, Runnable)}</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/2 0:19.
 */
public class Looping {
  static void hi() {
    System.out.println("Hi!");
  }

  public static void main(String[] args) {
    repeat(3, () -> System.out.println("Looping!"));
    repeat(2,Looping::hi);
  }
}
