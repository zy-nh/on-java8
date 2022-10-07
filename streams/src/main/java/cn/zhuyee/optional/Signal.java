package cn.zhuyee.optional;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * <h2>由 Optional 组成的流</h2>
 * 有一个可能会生成null值的生成器，用这个生成器创建一个流，将这些元素包在 Optional 中
 *
 * <br>
 * Created by zhuye at 2022/10/7 14:41.
 */
public class Signal {
  private final String msg;

  public Signal(String msg) {
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }

  @Override
  public String toString() {
    return "Signal(" + msg + ')';
  }

  static Random random = new Random(47);

  public static Signal morse(){
    switch (random.nextInt(4)) {
      case 1:
        return new Signal("dot");
      case 2:
        return new Signal("dash");
      default:
        return null;
    }
  }

  public static Stream<Optional<Signal>> stream(){
    return Stream.generate(Signal::morse)
        .map(signal -> Optional.ofNullable(signal));
  }
}
