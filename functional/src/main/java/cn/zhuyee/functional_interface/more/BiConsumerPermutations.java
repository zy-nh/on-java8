package cn.zhuyee.functional_interface.more;

import java.util.function.BiConsumer;

/**
 * <h2>基本类型的函数式接口</h2>
 * <p>
 * Created by zhuye on 2022/9/28 23:31.
 */
public class BiConsumerPermutations {
  static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d,%f%n", i, d);
  static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.printf("%d,%f%n", i, d);
  static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d,%d%n", i, l);

  public static void main(String[] args) {
    bicid.accept(47, 11.45);
    bicdi.accept(22.66, 99);
    bicil.accept(33, 13L);
  }

}