package cn.zhuyee.end;

import java.util.Random;
import java.util.stream.Stream;

/**
 * 组合所有的流原始
 */
public class Reduce {
  public static void main(String[] args) {
    Stream.generate(Frobnitz::supply)
      .limit(10)
      .peek(System.out::println)
      .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)  //fr0是上次调用这个reduce()时带回来的结果，fr1是来着流中的新值
      .ifPresent(System.out::println);
  }
}

class Frobnitz {
  int size;
  Frobnitz(int sz) { size = sz; }
  @Override
  public String toString() {
    return "Frobnitz(" + size + ")";
  }
  // 生成器:
  static Random rand = new Random(47);
  static final int BOUND = 100;

  static Frobnitz supply() {
    return new Frobnitz(rand.nextInt(BOUND));
  }
}