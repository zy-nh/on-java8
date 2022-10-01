package cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>若 x 和 i 在所返回的函数中没有修改，但在方法中的其它地方修改了，编译仍然报错</h2>
 * <p>
 * Created by zhuye on 2022/9/29 22:39.
 */
public class Closure4 {
  IntSupplier makeFun(int x) {
    // i 是函数的局部变量，当调用完 makeFun() 方法后i就消失了
    int i = 0;
    i++;
    x++;
    // 解决办法：在闭包中使用 x 和 i 之前，先将其赋值给最终变量
    // 赋值后不会修改 iFinal、xFinal的值，这里的 final 是多余的
    final int iFinal = i;
    final int xFinal = x;
    return () -> iFinal + xFinal;
  }
}
