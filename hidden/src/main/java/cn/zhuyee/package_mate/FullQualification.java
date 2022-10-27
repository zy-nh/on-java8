package cn.zhuyee.package_mate;

import java.util.Set;

/**
 * <h2>package：库单元</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/17 0:46.
 */
public class FullQualification {
  public static void main(String[] args) {
    String a = "a";
    test(a); // 传入的是a的引用，而不是值"a"
    System.out.println(a); // 打印出来的a的值仍然是 "a"
  }
  public static String test(String a) {
    a = "b";   // 重新定义的引用a,执行"b"
    System.out.println(a);
    return a;
  }
}
