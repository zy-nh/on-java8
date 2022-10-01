package cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>内部类作为闭包</h2>
 * <p>
 * Created by zhuye on 2022/9/29 23:02.
 */
public class AnonymousClosure {
  IntSupplier makeFun(int x) {
    int i = 0;

//    i++; // 并非 实际上的最终变量
//    x++; // 同上

    // 内部类，lambda写法：return () -> x + i;
    return new IntSupplier() {
      @Override
      public int getAsInt() {
        return x + i;
      }
    };
  }
}
