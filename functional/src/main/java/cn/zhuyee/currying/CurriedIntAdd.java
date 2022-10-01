package cn.zhuyee.currying;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * <h2>基本类型和装箱时，应用适当的函数式接口</h2>
 * <p>
 * Created by zhuye on 2022/10/1 14:18.
 */
public class CurriedIntAdd {
  public static void main(String[] args) {
    IntFunction<IntUnaryOperator>
        curriedIntAdd = a -> b -> a + b;
    IntUnaryOperator add = curriedIntAdd.apply(5);
    System.out.println(add.applyAsInt(8));
  }
}
