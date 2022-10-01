package cn.zhuyee.high_function;

import java.util.function.Function;

/**
 * <h2>高阶函数：是一个能接受函数作为参数或能把函数当返回值的函数</h2>
 * <p>
 *   把函数当作返回值
 *
 * Created by zhuye on 2022/9/29 0:06.
 */
public class ProduceFunction {
  static FuncSS produce() {
    // [2] 通过 lambda 表达式，在方法中创建并返回一个函数
    return s -> s.toLowerCase();
  }

  public static void main(String[] args) {
    FuncSS funcSS = produce();
    System.out.printf(funcSS.apply("YeLLinG"));
  }
}

// [1] 通过继承，可给专门的接口或类创建一个别名
interface FuncSS extends Function<String, String>{}
