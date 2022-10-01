package cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>若使用 i 的类型变为其包装类型呢？</h2>
 * <p>结论是编译不通过
 *
 * Created by zhuye on 2022/9/29 22:48.
 */
public class Closure5 {
  IntSupplier makeFun(final int x) {
    // 编译报错
    Integer i = 0;
//    i = i +1;
    return () -> x + i;
  }
}
