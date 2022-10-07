package cn.zhuyee.optional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * <h2>Optional.map()</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 14:23.
 */
public class OptionalMap {
  static String[] elements = {"12", "", "23", "45"};
  static Stream<String> testStream(){
    return Arrays.stream(elements);
  }

  static void test(String describe, Function<String, String> predicate) {
    System.out.println(" ---( " + describe + " )--- ");
    for (int i = 0; i <= elements.length; i++) {  // 注意这里的条件用的 <= ，所以最后一个元素实际会超出这个流，会自动变为 Optional.empty
      System.out.println(
          testStream()
              .skip(i)
              .findFirst()
              .map(predicate)
      );
    }
  }

  public static void main(String[] args) {
    // 若 Optional 不为 empty，将其传给函数时，map() 首先会提取 Optional 中的对象
    test("Add brackets", s -> "[" + s + "]");
    test("Increment",s ->{
      try {
        return Integer.parseInt(s) + 1 + "";
      } catch (Exception e) {
        return s;
      }
    });

    test("Replace", s -> s.replace("2", "9"));
    test("Take last digit", s -> s.length() > 0 ? s.charAt(s.length() - 1) + "" : s);
    // 在函数完成后，map() 会先把结果包含在一个 Optimal 中，然后返回
  }
}
