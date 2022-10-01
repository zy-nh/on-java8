package main.java.cn.zhuyee.closure;

import java.util.function.IntSupplier;

/**
 * <h2>闭包：它是使用 lambda 表达式及函数式接口所产生的问题且能从语言上解决的集合</h2>
 * 如一个 lambda 表达式，它使用了其函数作用域之外的变量，返回该函数时会发送什么？
 *
 * 若语言能解决这类问题，称语言是支持闭包的，或称其支持词法作用域。
 *
 * Created by zhuye on 2022/9/29 22:04.
 */
public class Closure1 {
  int i; // 共享变量

  IntSupplier makeFun(int x) {
    return () -> x + i++;
  }
}
