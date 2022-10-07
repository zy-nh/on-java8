package cn.zhuyee.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * <h2>流生成器</h2>
 * 对应前面读取文件并将其转为单词流 {@link RandomWords} 的案例来看
 * <ol>
 * 生成器（Builder）模式的一般步骤：
 *   <li>创建一个生成器对象</li>
 *   <li>为它提供多段构造信息</li>
 *   <li>最后执行“生成”（build）动作</li>
 * </ol>
 * {@link java.util.stream.Stream} 库中提供了这样的 Builder，通过方法 {@link Stream#builder()} 可生成一个
 * <br>
 * Created by zhuye at 2022/10/2 12:10.
 */
public class File2WordsBuilder {
  Stream.Builder<String> builder = Stream.builder();

  /**
   * 构造器中，在生成器里添加了文件中的所以单词，此时还未调用 {@link File2WordsBuilder#stream()} 方法
   * <br>
   * 即，只要还没调用 build()，就是说还没有生成流，就可以继续向 builder 对象中添加单词
   *
   * @param filePath
   * @throws IOException
   */
  public File2WordsBuilder(String filePath) throws IOException {
    Files.lines(Paths.get(filePath))
        .skip(1)          // 跳过开头注释行
        .forEach(line ->{
          for (String word : line.split("[ .?,]+"))
            builder.add(word);
        });
  }
  //

  /**
   * 通过{@link Stream.Builder}接口中的{@link Stream.Builder#build()}方法创建一个 Stream
   *
   * @return Stream<String>
   */
  Stream<String> stream(){
    return builder.build(); // build() 方法返回一个 Stream 流
  }

  public static void main(String[] args) throws IOException {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    new File2WordsBuilder(filePath)
        .stream()           // 调用 build() 方法生成一个流
        .limit(7)
        .map(w -> w + " ")
        .forEach(System.out::print);
  }
}
