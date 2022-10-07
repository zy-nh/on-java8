package cn.zhuyee.create;

import java.util.stream.Stream;

/**
 * <h2>创建一个由完全相同的对象组成的流</h2>
 * 只需要将一个生成这些对象的 lambda 表达式传给 generate()
 *
 * <br>
 * Created by zhuye at 2022/10/2 10:18.
 */
public class Duplicator {
  public static void main(String[] args) {
    // String 类型是流，传入其 lambda 表达式
    Stream.generate(() -> "duplicate")
        .limit(3)
        .forEach(System.out::println);
  }
}
