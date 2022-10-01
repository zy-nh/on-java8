package cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>Title</h2>
 * <p>
 * Created by zhuye on 2022/9/29 22:21.
 */
public class Closure2 {
  /**
   * makeFun() 返回的 IntSupplier 是在 i 和 x 之上构建的闭包
   * 所以当我们调用所返回的函数时，这两个变量是有效的
   * 但是，这里的 i 不能像 Closure1 中的 i 那样自增，会出现编译错误
   * x 和 i 改变后会报相同错误：Variable used in lambda expression should be final or effectively final
   *
   * @param x
   * @return
   */
  IntSupplier makeFun(int x) {
    // i 是函数的局部变量，当调用完 makeFun() 方法后i就消失了
    int i = 0;
    return () -> x + i;
  }
}
