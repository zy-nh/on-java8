package cn.zhuyee.optional;

import java.util.Optional;

/**
 * <h2>Title</h2>
 * 使用 {@link Signal#stream()}，弄清楚如何获得 Optional 中的对象
 * <br>
 * Created by zhuye at 2022/10/7 14:48.
 */
public class StreamOfOptionals {
  public static void main(String[] args) {
    Signal.stream()
        .limit(10)
        .forEach(System.out::println);
    System.out.println("-----------------------------");
    Signal.stream()
        .limit(10)
        .filter(Optional::isPresent)   // 过滤：保留非 empty 的 Optional
        .map(Optional::get)            // 通过调用 get() 来获取包在其中的对象
        .forEach(System.out::println);
  }
}
