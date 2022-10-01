package cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>为什么Closure2中没有声明为final的，但仍然可以用？</h2>
 * <p>因为在Java8的语法中，虽然没有显式的将一个变量声明为final的，但仍可以用最终变量方式对待它，只有不修改即可
 *
 * Created by zhuye on 2022/9/29 22:35.
 */
public class Closure3 {
  // 将变量 x i 都标记为最终变量，赋值后不可修改
  IntSupplier makeFun(final int x) {
    // i 是函数的局部变量，当调用完 makeFun() 方法后i就消失了
    final int i = 0;
    return () -> x + i;
  }
}
