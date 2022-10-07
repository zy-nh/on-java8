package cn.zhuyee.optional;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * <h2>Optional.flatMap()应用与已经会生成 Optional 的映射函数</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 14:33.
 */
public class OptionalFlatMap {
  static String[] elements = {"12", "", "23", "45"};
  static Stream<String> testStream(){
    return Arrays.stream(elements);
  }

  static void test(String describe, Function<String, Optional<String>> predicate) {
    System.out.println(" ---( " + describe + " )--- ");
    for (int i = 0; i <= elements.length; i++) {  // 注意这里的条件用的 <= ，所以最后一个元素实际会超出这个流，会自动变为 Optional.empty
      System.out.println(
          testStream()
              .skip(i)
              .findFirst()
              .flatMap(predicate)
      );
    }
  }

  public static void main(String[] args) {
    // flatMap() 会获得 非empty 的Optional 中的对象，并将其交给映射函数
    test("Add brackets", s -> Optional.of("[" + s + "]"));
    test("Increment",s ->{
      try {
        return Optional.of(Integer.parseInt(s) + 1 + "");
      } catch (Exception e) {
        return Optional.of(s);
      }
    });

    test("Replace", s -> Optional.of(s.replace("2", "9")));
    test("Take last digit", s -> Optional.of(s.length() > 0 ? s.charAt(s.length() - 1) + "" : s));
    // 在函数完成后，flatMap() 不会先把结果包含在一个 Optimal 中，因为这个操作映射函数已经做了
  }
}
