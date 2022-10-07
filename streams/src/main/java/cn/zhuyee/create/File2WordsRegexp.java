package cn.zhuyee.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h2>使用正则表达式完成之前的读取文件转为单词</h2>
 * {@link Pattern#splitAsStream(CharSequence)} ：该方法接受一个字符序列，并根据传入的公式将其分割为一个流
 * <br>
 * Created by zhuye at 2022/10/2 14:32.
 */
public class File2WordsRegexp {
  private String all; // 用于接收构造器中读取的所有行

  public File2WordsRegexp(String filePath) throws IOException {
    all = Files.lines(Paths.get(filePath))
        .skip(1)
        .collect(Collectors.joining(" "));
  }

  public Stream<String> stream(){
    // 若在由文本行组成的输入流上使用 map()，会生成一个由单词流组成的流，但我们实际只是要一个单词流
    return Pattern.compile("[ .,?]+").splitAsStream(all); // 生成的结果是一个流
  }

  public static void main(String[] args) throws IOException {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    File2WordsRegexp fw = new File2WordsRegexp(filePath);

    // 这里可以多次调用 stream() ，每次都从保存的 String 创建一个新的流
    fw.stream()
        .limit(7)
        .map(w -> w + " ")
        .forEach(System.out::print);

    fw.stream()
        .skip(7)
        .limit(5)
        .map(w -> w + " ")
        .forEach(System.out::print);
  }
}
