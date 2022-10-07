package cn.zhuyee.middle;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * <h2>将函数应用与每个流元素</h2>
 * 将不同的 Function 映射（map()）到了一个有 String 组成的流中
 * <br>
 * Created by zhuye at 2022/10/6 23:07.
 */
public class FunctionMap {
  static String[] elements = {"12", "", "33", "87"};
  static Stream<String> testStream(){
    return Arrays.stream(elements);
  }

  static void test(String describe, Function<String, String> function) {
    System.out.println("--------------( "+describe+" )--------------");
    testStream()
        .map(function)
        .forEach(System.out::println);
  }

  public static void main(String[] args) {
    test("add brackets", s -> "[" + s + "]");

    test("Increment",s -> {
      try {
        return Integer.parseInt(s) + 1 + "";
      } catch (NumberFormatException e) {
        return s;
      }
    });

    test("Replace", s -> s.replace("2", "9"));

    test("Take last diget", s -> s.length() > 0 ? s.charAt(s.length() - 1) + "" : s);
  }
}
