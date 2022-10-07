package cn.zhuyee.end;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <h2>匹配</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 16:17.
 */
public class Matching {
  static void show(Matcher matcher, int val) {
    System.out.println(
        matcher.test(
            IntStream.rangeClosed(1, 9)
                .boxed()
                .peek(n -> System.out.format("%d ", n)),
            n -> n < val));
  }

  public static void main(String[] args) {
    show(Stream::allMatch, 10);
    show(Stream::allMatch, 4);
    show(Stream::anyMatch, 2);
    show(Stream::anyMatch, 0);
    show(Stream::noneMatch, 5);
    show(Stream::noneMatch, 0);
  }
}

/**
 * BiPredicate<Stream<Integer>, Predicate<Integer>> 是一个二元谓词，会接受两个参数，并返回 true 或 false
 * 第一个参数就是我们要测试的数值的流
 * 第二个参数是谓词 Predicate 本身
 */
interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>>{}
