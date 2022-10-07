package cn.zhuyee.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h2>使用 Random 来创建一个用来提供任何一组对象的 Supplier</h2>
 *
 *
 * <br>
 * Created by zhuye at 2022/10/1 22:42.
 */
public class RandomWords implements Supplier<String> {
  List<String> words = new ArrayList<>();
  Random random = new Random(47);

  RandomWords(String fname) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(fname));
    // 跳过第一行：第一行为注释
    for (String line : lines.subList(1, lines.size())) {
      // 通过正则表达式进行匹配分割
      // 每一行在空格处、或者中括号内的其它符号处分割，右方括号后的 + 表示前面的事物出现一次或多次
      for (String word : line.split("[ .?,]+"))
        words.add(word.toLowerCase());
    }
  }

  // 重写函数式接口的方法
  @Override
  public String get(){
    return words.get(random.nextInt(words.size()));
  }

  @Override
  public String toString() {
    return words.stream()
        .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) throws IOException {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    System.out.println(
        Stream.generate(new RandomWords(filePath))    // 它可以接受任何的 Supplier<T>，并生成一个由 T 类型的对象组成的流
            .limit(10)
            .collect(Collectors.joining(" ")) // collect()操作：根据其参数将所有的流元素组合起来，内部操作得到一个String
    );
  }
}
