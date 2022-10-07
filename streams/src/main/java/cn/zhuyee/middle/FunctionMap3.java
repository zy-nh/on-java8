package cn.zhuyee.middle;

import java.util.stream.Stream;

/**
 * <h2>Function 生成的结果类型是某种数值类型，必须使用相应的 mapTo 操作来代替</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 10:18.
 */
public class FunctionMap3 {
  public static void main(String[] args) {

    Stream.of("5", "7", "9")
        .mapToInt(Integer::parseInt)
        .forEach(n -> System.out.format("%d ", n));

    System.out.println();

    Stream.of("17", "19", "23")
        .mapToLong(Long::parseLong)
        .forEach(n -> System.out.format("%d ", n));

    System.out.println();

    Stream.of("17", "1.9", ".23")
        .mapToDouble(Double::parseDouble)
        .forEach(n -> System.out.format("%.2f ", n));  // 保留 2 位小数
  }
}
