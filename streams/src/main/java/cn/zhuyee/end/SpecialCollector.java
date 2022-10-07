package cn.zhuyee.end;

import cn.zhuyee.middle.FileToWords;

import java.util.ArrayList;

/**
 * <h2>特殊的收集器</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 16:02.
 */
public class SpecialCollector {
  public static void main(String[] args) throws Exception {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    ArrayList<String> words = FileToWords.stream(filePath)
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    words.stream()
        .filter(s -> s.equals("cheese"))
        .forEach(System.out::println);
  }
}
