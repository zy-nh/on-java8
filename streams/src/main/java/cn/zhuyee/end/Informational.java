package cn.zhuyee.end;

import cn.zhuyee.middle.FileToWords;

/**
 * <h2>获得流相关的信息</h2>
 * <ol>
 *   <li>count()</li>
 *   <li>max(Comparator)</li>
 *   <li>min(Comparator)</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/7 16:36.
 */
public class Informational {
  public static void main(String[] args) throws Exception {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";

    System.out.println(FileToWords.stream(filePath).count());
    // min() | max() 都会返回 Optional，这里通过 orElse() 来获取其中的值
    System.out.println(FileToWords.stream(filePath).min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
    System.out.println(FileToWords.stream(filePath).max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
  }
}
