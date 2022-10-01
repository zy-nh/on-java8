package main.java.cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>共享变量空间</h2>
 * <p>
 * Created by zhuye on 2022/9/29 22:11.
 */
public class SharedStorage {
  public static void main(String[] args) {
//    Closure1 closure1 = new Closure1();
    Closure2 closure1 = new Closure2();
    IntSupplier f1 = closure1.makeFun(5);
    IntSupplier f2 = closure1.makeFun(5);
    IntSupplier f3 = closure1.makeFun(5);

    System.out.println(f1.getAsInt());
    System.out.println(f2.getAsInt());
    System.out.println(f3.getAsInt());
  }
}
