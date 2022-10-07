package cn.zhuyee.create;

import java.util.Arrays;

/**
 * <h2>{@link java.util.Arrays#stream(Object[])} 方法生成 IntStream、LongStream、DoubleStream</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/2 14:17.
 */
public class ArrayStreams {
  public static void main(String[] args) {
    Arrays.stream(new double[]{3.1415926, 2.718, 1.618})
        .forEach(n -> System.out.format("%f ", n));
    System.out.println();
    Arrays.stream(new int[]{1, 4, 6})
        .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    Arrays.stream(new long[]{22, 55, 77, 88})
        .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    // 选择一个子区间：后面两个额外参数 指明起始位置和结束位置
    Arrays.stream(new int[]{1, 3, 5, 7, 13, 17, 23, 29, 31},3,7)
        .forEach(n -> System.out.format("%d ", n));
  }
}
