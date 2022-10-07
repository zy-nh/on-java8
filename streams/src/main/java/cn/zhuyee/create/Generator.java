package cn.zhuyee.create;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h2>Stream.generate() 方法</h2>
 * 它可以接受任何的 Supplier<T>，并生成一个由 T 类型的对象组成的流
 * <br>
 * 1.实现接口 {@link Supplier}，重写 {@link Supplier#get()} 方法
 * <br>
 * Created by zhuye at 2022/10/2 0:27.
 */
public class Generator implements Supplier<String> {

  Random random = new Random(47);
  char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  
  @Override
  public String get() {
    // random.nextInt(letters.length) 用于选择字母表中的大写字母，参数是告诉它可以接受的最大随机数，这样做也是为了不会数组越界
    return "" + letters[random.nextInt(letters.length)];
  }

  public static void main(String[] args) {
    String word = Stream.generate(new Generator())
                        .limit(30)
                        .collect(Collectors.joining());
    System.out.println(word);
  }
}
