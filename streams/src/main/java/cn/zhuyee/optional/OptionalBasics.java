package cn.zhuyee.optional;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * <h2>Title</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 12:20.
 */
public class OptionalBasics {
  static void test(Optional<String> optString) {
    if (optString.isPresent()) { // 判断里面是否有东西
      System.out.println(optString.get());  // 有就获取
    } else {
      System.out.println("Nothing inside!");
    }
  }
  public static void main(String[] args) {
    test(Stream.of("Epithets").findFirst());
    test(Stream.<String>empty().findFirst()); // 创建一个空流
  }
}
