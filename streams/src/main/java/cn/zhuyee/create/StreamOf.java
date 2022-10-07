package cn.zhuyee.create;

import java.util.stream.Stream;

/**
 * <h2>Stream.of()</h2>
 * <li>它可以将一组条目变成一个流</li>
 * <li>此外，每个 Collection 都可以使用 stream() 方法来生成一个流，详见：{@link Collection2Stream Collection2Stream}</li>
 *
 * <br>
 * Created by zhuye at 2022/10/1 18:06.
 */
public class StreamOf {
  public static void main(String[] args) {

    Stream.of(new Bubble(1),new Bubble(2),new Bubble(3))
        .forEach(System.out::println);

    Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
        .forEach(System.out::print);

    System.out.println();

    Stream.of(3.1415,2.88,5.908)
        .forEach(System.out::println);
  }
}
