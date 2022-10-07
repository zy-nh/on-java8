package cn.zhuyee.optional;

import java.util.Optional;

/**
 * <h2>创建 Optional</h2>
 * 有3个静态方法来创建
 * <br>
 * Created by zhuye at 2022/10/7 12:51.
 */
public class CreatingOptional {
  static void test(String testName, Optional<String> optional) {
    System.out.println(" === " + testName + " === ");
    System.out.println(optional.orElse("Null"));
  }

  public static void main(String[] args) {
    test("empty", Optional.empty());
    test("of", Optional.of("Howdy"));
    try {
      test("of", Optional.of(null));
    } catch (Exception e) {
      System.out.println(e);
    }
    test("ofNullable", Optional.ofNullable("Hi"));
    test("ofNullable", Optional.ofNullable(null));
  }
}
