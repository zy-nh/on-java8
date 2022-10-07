package cn.zhuyee.end;

import static cn.zhuyee.end.RandInts.rands;

/**
 * 在每个流元素上应用某个终结操作
 */
public class ForEach {
  static final int SZ = 14;

  public static void main(String[] args) {

    System.out.println("====================>第一个流：");
    // 第一个流没有使用 parallel()，产生的的结果顺序就是它们从 rands() 中出现的顺序
    rands().limit(SZ)
      .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    System.out.println("====================>第二个流：");

    rands().limit(SZ)
      .parallel()  // 将流分割为多个流，并让Java尝试在多个处理器上执行，所以执行后顺序是不同的
      .forEach(n -> System.out.format("%d ", n));  // 可以按任何顺序操作元素
    System.out.println();
    System.out.println("====================>第三个流：");

    rands().limit(SZ)
      .parallel()
      .forEachOrdered(n -> System.out.format("%d ", n));  // 确保 forEach 对元素的操作顺序是原始的流的顺序
  }
}