package cn.zhuyee.end;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h2>从某个流生成一个Map</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 15:50.
 */
public class MapCollector {
  public static void main(String[] args) {
    Map<Integer, Character> map =
        new RandomPair().stream()
                        .limit(8)
                        .collect(Collectors.toMap(Pair::getI, Pair::getC));
    System.out.println(map);
  }
}

/**
 * 基本的数据对象，保存 c 和 i 的值
 */
class Pair{
  public final Character c;
  public final Integer i;

  Pair(Character c, Integer i) {
    this.c = c;
    this.i = i;
  }

  public Character getC() { return c; }
  public Integer getI() { return i; }
  @Override
  public String toString() {
    return "Pair(" + c + ", " + i + ")";
  }
}

/**
 * 核心是 stream() 方法，生成一个 Pair 流
 */
class RandomPair {
  Random rand = new Random(47);
  // 一个无限大的迭代器，指向随机生成的大写字母：
  Iterator<Character> capChars = rand.ints(65,91)  // 65~91对应ASCII值，就是大写字母
                                      .mapToObj(i -> (char)i)  // 将 int 转为 char，会自动装箱变为 Character
                                      .iterator();
  // 生成的 Pair 对象是由随机生成的大写字母与随机生成的100~1000范围内的整数值组成的值对
  public Stream<Pair> stream() {
    return rand.ints(100, 1000).distinct()
        .mapToObj(i -> new Pair(capChars.next(), i));
  }
}