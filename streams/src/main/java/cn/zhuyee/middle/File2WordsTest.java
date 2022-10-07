package cn.zhuyee.middle;

/**
 * <h2>测试</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 11:02.
 */
public class File2WordsTest {
  public static void main(String[] args) throws Exception {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    FileToWords.stream(filePath)
        .limit(7)
        .forEach(s -> System.out.format("%s ", s));
    System.out.println();
    FileToWords.stream(filePath)
        .skip(7)
        .limit(2)
        .forEach(s -> System.out.format("%s ", s));
  }
}
