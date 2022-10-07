package cn.zhuyee.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * <h2>便捷函数：用于获取 Optional 中的数据</h2>
 * ifPresent(Consumer)	若值存在，则用这个值来调用Consumer，否则什么不做
 * <br>
 * orElse(otherObject)	若对象存在，则返回该对象，否则返回 otherObject
 * <br>
 * orElseGet(Supplier)	若对象存在，则返回该对象，否则返回使用 Supplier 函数创建的替代对象
 * <br>
 * orElseThrow(Supplier)	若对象存在，则返回该对象，否则抛出一个使用 Supplier 函数创建的移除
 * <br>
 * Created by zhuye at 2022/10/7 12:35.
 */
public class Optionals {
  static void basics(Optional<String> stringOptional) {
    if (stringOptional.isPresent())
      System.out.println(stringOptional.get());
    else
      System.out.println("Nothing inside!");
  }

  static void ifPresent(Optional<String> stringOptional) {
    stringOptional.ifPresent(System.out::println);
  }

  static void orElse(Optional<String> stringOptional) {
    System.out.println(stringOptional.orElse("Nada"));
  }

  static void orElseGet(Optional<String> stringOptional) {
    System.out.println(stringOptional.orElseGet(() -> "Generated"));
  }

  static void orElseThrow(Optional<String> stringOptional) {
    try {
      System.out.println(stringOptional.orElseThrow(
          () -> new Exception("Supplied")
      ));
    } catch (Exception e) {
      System.out.println("Caught" + e);
    }
  }

  static void test(String testName, Consumer<Optional<String>> consumer) {
    System.out.println(" === " + testName + " === ");
    consumer.accept(Stream.of("Epithets").findFirst());
    consumer.accept(Stream.<String>empty().findFirst());
  }

  public static void main(String[] args) {
    test("basics", Optionals::basics);
    test("ifPresent", Optionals::ifPresent);
    test("orElse", Optionals::orElse);
    test("orElseGet", Optionals::orElseGet);
    test("orElseThrow", Optionals::orElseThrow);
  }
}
