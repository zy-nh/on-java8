package cn.zhuyee.create;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * <h2>创建单独的工厂方法的替代方案</h2>
 * {@link Bubble#bubbler()} 方法与 {@link java.util.function.Supplier} 接口兼容
 * <br>
 * 所以可以将其方法引用 传给 {@link Stream#generate(Supplier<Bubble>)}
 * <br>
 * Created by zhuye at 2022/10/2 11:25.
 */
public class Bubbles {
  public static void main(String[] args) {
    Stream.generate(Bubble::bubbler)
        .limit(5)
        .forEach(System.out::println);
  }
}
