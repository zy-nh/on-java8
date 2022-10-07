package cn.zhuyee.middle;

import java.util.stream.Stream;

/**
 * <h2>使用 map 期间组合流</h2>
 * 解决 {@link StreamOfStreams#main(String[])} 中产生的问题
 *
 * <br>
 * Created by zhuye at 2022/10/7 10:36.
 */
public class FlatMap {
  public static void main(String[] args) {
    Stream.of(1, 2, 3)
        .flatMap(
            integer -> Stream.of("Gonzo", "Fozzie", "Beaker"))  // 每个数字都映射一个 String 对象流，通过 flatMap将其展开为 String 元素
        .forEach(System.out::println);
  }
}
