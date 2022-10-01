package main.java.cn.zhuyee.high_function;

import java.util.function.Function;

/**
 * <h2>根据接受的函数生成一个新函数</h2>
 * <p>
 * Created by zhuye on 2022/9/29 21:41.
 */
public class TransformFunction {
  /**
   * transform() 会生成一个与所传入函数签名（参数与返回值）相同的函数
   * @param in 传入函数
   * @return 返回一个新的函数
   */
  static Function<I, O> transform(Function<I, O> in) {
    // andThen() 方法：专门为操作函数而设计的。它会在 in 函数调用后调用（还有一个 compose() 方法，会在in函数之前应用新函数）
    // 要附加上一个 andThen() 函数，只需要将该函数（in函数）作为参数传递
    // 从 transform() 传出的是一个新函数，它将 in 的动作和 andThen() 参数的动作结合起来
    return in.andThen(o -> {
      System.out.println(o);
      return o;
    });
  }

  public static void main(String[] args) {
    Function<I, O> function = transform(i -> {
      System.out.println(i);
      return new O();
    });
    O o = function.apply(new I());
    o.toString();
  }
}

class I{
  @Override
  public String toString() {
    return "I";
  }
}

class O{
  @Override
  public String toString() {
    return "O";
  }
}