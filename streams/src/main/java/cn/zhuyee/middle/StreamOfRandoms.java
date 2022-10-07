package cn.zhuyee.middle;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <h2>从一个整数值组成的流开始，使用其中每个来创建很多随机数</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 10:42.
 */
public class StreamOfRandoms {
  static Random random = new Random(47);

  public static void main(String[] args) {
    Stream.of(1, 2, 3, 4, 5)
        // concat() 会按照参数的顺序将两个流组合到一起
        .flatMapToInt(integer -> IntStream.concat(
            // random.ints() 会生成一个 IntStream
            random.ints(0, 100).limit(integer), IntStream.of(-1)))
        .forEach(n -> System.out.format("%d ", n));
  }
}
