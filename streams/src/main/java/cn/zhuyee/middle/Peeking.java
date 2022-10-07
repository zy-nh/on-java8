package cn.zhuyee.middle;

/**
 * <h2>跟踪与调试</h2>
 * peek() 接受的是一个遵循 Consumer 函数式接口的函数，无返回值
 * <br>
 * Created by zhuye at 2022/10/6 22:37.
 */
public class Peeking {
  public static void main(String[] args) throws Exception {
    String filePath = "D:\\IDEA3.2_pro\\on-java8\\streams\\src\\main\\java\\cn\\zhuyee\\create\\Cheese.dat";
    FileToWords.stream(filePath)
        .skip(21)
        .limit(4)
        .map(w -> w + " ")
        .peek(System.out::print)
        .map(String::toUpperCase)
        .peek(System.out::print)
        .map(String::toLowerCase)
        .forEach(System.out::print);
  }
}
