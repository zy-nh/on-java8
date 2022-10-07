package cn.zhuyee.create;

import java.util.*;

/**
 * <h2>集合通过 stream() 方法生成流</h2>
 * <ol>
 *    <li>集合调用 stream() 方法生成一个流</li>
 *    <li>中间的 map() 操作接受流中的每个元素，在其上应用一个操作来创建一个新的元素；普通的 map() 接受对象并生成对象</li>
 *    <li>最后 通过 forEach 来遍历</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/1 18:22.
 */
public class Collection2Stream {
  public static void main(String[] args) {

    List<Bubble> bubbles = Arrays.asList(
        new Bubble(1), new Bubble(2), new Bubble(3));
    System.out.println(
        bubbles.stream()
              .mapToInt(b -> b.i)  // 通过这个方法，将对象流转变为一个包含 Integer 的 IntStream
              .sum()
    );

    Set<String> w = new HashSet<>(Arrays.asList(
        "It's a wonderful day for pie!".split(" ")));
    w.stream()
        .map(x -> x + " ")
        .forEach(System.out::print);
    System.out.println();

    Map<String, Double> m = new HashMap<>();
    m.put("pi", 3.1415926);
    m.put("e", 2.718);
    m.put("phi", 1.618);
    m.entrySet().stream()              // 调用 entrySet() 来生成一个对象流，每个对象都包含一个键和对应的值
        .map(e -> e.getKey()+": "+e.getValue())
        .forEach(System.out::println);

  }
}
