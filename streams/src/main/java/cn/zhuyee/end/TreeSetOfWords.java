package cn.zhuyee.end;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <h2>收集操作</h2>
 * 提取当前文件中的单词，放到 TreeSet 中
 * <br>
 * Created by zhuye at 2022/10/7 15:37.
 */
public class TreeSetOfWords {
  public static void main(String[] args) throws IOException {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\end\\TreeSetOfWords.java";
    Set<String> words = Files.lines(Paths.get(filePath))
        .flatMap(s -> Arrays.stream(s.split("\\W+"))) // 以一个或多个非单词字符为边界来分割这些文本行，并将生成的数组变为流
        .filter(s -> !s.matches("\\d+"))    // 不要数字
        .map(String::trim)  // 去除空白
        .filter(s -> s.length() > 2) // 过滤掉长度小于3的单词
        .limit(100)
        .collect(Collectors.toCollection(TreeSet::new));  // 最后将这些单词放入 TreeSet 中
    System.out.println(words);
  }
}
/*
[2_pro, Arrays, Collectors, Created, Files, IDEA3, IOException, Paths, Set, String, System, TreeSet, TreeSetOfWords, args, class, collect, end, file, filePath, filter, flatMap, get, import, java, java8, length, limit, lines, main, map, matches, new, nio, out, package, println, public, split, src, static, stream, streams, throws, toCollection, trim, util, void, words, zhuye, zhuyee]
*/