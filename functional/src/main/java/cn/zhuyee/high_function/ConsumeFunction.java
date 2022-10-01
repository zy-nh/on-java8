package cn.zhuyee.high_function;

import java.util.function.Function;

/**
 * <h2>要接受并使用函数，方法必须在其参数列表中正确描述函数类型</h2>
 * <p>
 * Created by zhuye on 2022/9/29 0:12.
 */
public class ConsumeFunction {
  static Two consume(Function<One,Two> onetwo) {
    return onetwo.apply(new One());
  }

  public static void main(String[] args) {
    Two two = consume(one -> new Two());
  }
}

class One{}
class Two{}