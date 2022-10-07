package cn.zhuyee.middle;

import java.util.stream.Stream;

/**
 * <h2>在应用 map() 期间组合流</h2>
 *   背景：若有一个由传入元素组成的流，在其上应用一个 map() 函数，该函数会将每个元素都生成流
 * <br>
 *   存在问题：我们想要的是一个由元素组成的流，但生成了一个由元素流组成的流
 * <br>
 *   解决方法：使用 flatMap() 函数，它会做两件事：
 *   <br>
 *      - 1.接受生成流的函数，并将其应用于传入元素
 *   <br>
 *      - 2.再将每个流“扁平化”处理，将其展开为元素
 * <br>
 * Created by zhuye at 2022/10/7 10:25.
 */
public class StreamOfStreams {
  public static void main(String[] args) {
    // 结果并没有得到想要的 String 流，而是一个由指向其它流的 “头” 组成的流
    Stream.of(1, 2, 3)
        .map(integer -> Stream.of("Gonzo", "Kermit", "Beaker"))
        .map(e -> e.getClass().getName())
        .forEach(System.out::println);
  }
}
