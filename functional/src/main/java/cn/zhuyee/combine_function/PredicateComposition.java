package cn.zhuyee.combine_function;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * <h2>Predicate谓词，执行 或运算</h2>
 * <p>
 * Created by zhuye on 2022/10/1 12:04.
 */
public class PredicateComposition {
  // p4 方法的功能：若字符串中不包含 ‘bar’ 且 字符串长度<5，或者 字符串包含 ‘foo’，那么返回结果为 true
  static Predicate<String>
    p1 = s -> s.contains("bar"),
    p2 = s -> s.length() < 5,
    p3 = s -> s.contains("foo"),
    p4 = p1.negate().and(p2).or(p3);

  public static void main(String[] args) {
    Stream.of("bar","foobar","foobaz","fongopuckey")
        .filter(p4)
        .forEach(System.out::println);
  }
}
