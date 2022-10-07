package cn.zhuyee.create;

import static java.util.stream.IntStream.range;

/**
 * <h2>int类型的去间范围</h2>
 * IntStream 类提供了一个 range() 方法，可以生成一个流——由 int 值组成的序列
 * <br>
 * Created by zhuye at 2022/10/2 0:05.
 */
public class Ranges {
  public static void main(String[] args) {
    // 传统方式
    int result = 0;
    for (int i = 10; i < 20; i++)
      result += i;
    System.out.println(result);
    
    // for-in 搭配一个区间范围：创建了一个range()，将其变为一个可用在 for-in 语句中的数组
    result = 0;
    for (int i : range(10, 20).toArray())
      result += i;
    System.out.println(result);

    // 使用流：对区间内的整数值进行求和，使用 sum() 方法
    System.out.println(range(10,20).sum());
  }
}
