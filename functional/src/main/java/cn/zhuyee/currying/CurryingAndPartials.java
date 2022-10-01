package main.java.cn.zhuyee.currying;

import java.util.function.Function;

/**
 * <h2>柯里化 和 部分求值</h2>
 * <ul>柯里化
 *  <li>将一个接受多个参数的函数 转变为 一系列只接受一个参数的函数</li>
 *  <li>目的：能够通过一个参数来创建一个新的函数</li></li>
 * </ul>
 * Created by zhuye on 2022/10/1 12:15.
 */
public class CurryingAndPartials {

  // 未柯里化
  static String uncurried(String a, String b) {
    return a + b;
  }

  public static void main(String[] args) {
    // 柯里化函数
    Function<String, Function<String, String>> sum =
        a -> b -> a + b;
    System.out.println(uncurried("Hi ", "Ho"));

    Function<String, String>
        hi = sum.apply("Hi ");
    System.out.println(hi.apply("Hoo"));

    // 部分引用
    Function<String, String> sumHi =
        sum.apply("Hup ");
    System.out.println(sumHi.apply("Ho"));
    System.out.println(sumHi.apply("Hey"));
  }
}
