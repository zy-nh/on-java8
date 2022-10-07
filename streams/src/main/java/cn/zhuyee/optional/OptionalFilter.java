package cn.zhuyee.optional;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * <h2>filter(Predicate)</h2>
 * 将 Predicate 应用于 Optional 的内容，并返回其结果
 * <br>
 * Created by zhuye at 2022/10/7 13:12.
 */
public class OptionalFilter {

  static String[] elements = {"Foo", "Bar", "Baz", "Bingo"};

  static Stream<String> testStream(){
    return Arrays.stream(elements);
  }

  static void test(String describe, Predicate<String> predicate) {
    System.out.println(" ---( " + describe + " )--- ");
    for (int i = 0; i <= elements.length; i++) {  // 注意这里的条件用的 <= ，所以最后一个元素实际会超出这个流，会自动变为 Optional.empty
      System.out.println(
          testStream()
              .skip(i)
              .findFirst()
              .filter(predicate)
      );
    }
  }

  public static void main(String[] args) {
    test("true", str -> true);
    test("false", str -> false);
    test("str != \"\"", str -> str != "");
    test("str.length() == 3", str -> str.length() == 3);
    test("startsWith(\"B\")", str -> str.startsWith("B"));
  }
}
