package cn.zhuyee.end;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <h2>选择某个流的最后一个元素，用 reduce()</h2>
 * reduce((n1, n2) -> n2)：参数是用两个元素中的后一个替换了这两个，那么最终得到的流中就只剩最后一个元素了
 * <br>
 * Created by zhuye at 2022/10/7 16:31.
 */
public class LastElement {
  public static void main(String[] args) {
    OptionalInt last = IntStream.range(10, 20).reduce((n1, n2) -> n2);
    System.out.println(last.orElse(-1));
    // 非数值对象
    Optional<String> lastObj = Stream.of("one", "two", "three")
        .reduce((n1, n2) -> n2);
    System.out.println(lastObj.orElse("Nothing there"));
  }
}
