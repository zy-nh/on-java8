package cn.zhuyee.middle;

import cn.zhuyee.create.File2WordsRegexp;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * 解决 {@link File2WordsRegexp#stream()} 中存在的问题
 */
public class FileToWords {
  // 静态方法，它自己就能完成整个流的创建过程
  public static Stream<String> stream(String filePath)
  throws Exception {
    return Files.lines(Paths.get(filePath))
      .skip(1) // First (comment) line
      .flatMap(line ->
        Pattern.compile("\\W+").splitAsStream(line)); // 正则表达式：\\W+ 的含义：\\W 意味着一个 非单词字符，而 + 表示一个或多个
  }
}