package cn.zhuyee.middle;

import java.util.Comparator;

/**
 * <h2>对流元素进行排序</h2>
 * sorted()函数，可接受 Comparator 参数
 * 也可以传入一个 lambda 函数作为参数
 * <br>
 * Created by zhuye at 2022/10/6 22:47.
 */
public class SortedComparator {
  public static void main(String[] args) throws Exception {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    FileToWords.stream(filePath)
        .skip(10)
        .limit(10)
        .sorted(Comparator.reverseOrder())  // 逆转自然顺序
        .map(w -> w+" ")
        .forEach(System.out::print);
  }
}
