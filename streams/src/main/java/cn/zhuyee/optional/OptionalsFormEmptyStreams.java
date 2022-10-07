package cn.zhuyee.optional;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <h2>Optional类</h2>
 * 背景：若我们向流中请求对象，但流中什么都没有，此时会发生什么？
 * <br>
 * 有没有什么对象，既可以作为流元素来占位，也可以在我们要找的元素不存在时友好的告知我们-- Optional 类型
 * <br>
 * Created by zhuye at 2022/10/7 12:09.
 */
public class OptionalsFormEmptyStreams {
  public static void main(String[] args) {

    // Stream.<String>empty() 创建一个 空流

    System.out.println(Stream.<String>empty()
        .findFirst()); // 返回包含第一个元素的 Optional，若流为空，返回 Optional.empty
    System.out.println(Stream.<String>empty()
        .findAny());   // 返回包含任何元素的 Optional，若流为空，返回 Optional.empty
    System.out.println(Stream.<String>empty()
        .max(String.CASE_INSENSITIVE_ORDER)); // 返回包含流中最大值的 Optional，若流为空，返回 Optional.empty
    System.out.println(Stream.<String>empty()
        .min(String.CASE_INSENSITIVE_ORDER)); // 返回包含流中最小值的 Optional，若流为空，返回 Optional.empty
    System.out.println(Stream.<String>empty()
        .reduce((s1, s2) -> s1 + s2));        // 会将返回值包在一个 Optional 中
    System.out.println(IntStream.empty()
        .average());   // 将数值化的流的结果包在一个 Optional 中，以防流为空
  }
}
/* Output:
Optional.empty
Optional.empty
Optional.empty
Optional.empty
Optional.empty
OptionalDouble.empty
*/
