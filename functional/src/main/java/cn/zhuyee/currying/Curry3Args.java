package main.java.cn.zhuyee.currying;

import java.util.function.Function;

/**
 * <h2>对接受3个参数的函数进行柯里化</h2>
 *
 * <p>对于每一层级联箭头，都要在其类型声明外再包裹另一个 Function
 *
 * Created by zhuye on 2022/10/1 13:59.
 */
public class Curry3Args {
  public static void main(String[] args) {
    Function<String,
        Function<String,
            Function<String, String>>> sum =
        a -> b -> c -> a + b + c;
    Function<String,
        Function<String, String>> hi =
        sum.apply("Hi ");
    Function<String, String> ho =
        hi.apply("Ho ");
    System.out.println(ho.apply("Hup"));
  }
}
