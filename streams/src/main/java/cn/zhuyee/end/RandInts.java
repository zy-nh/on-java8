package cn.zhuyee.end;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * <h2>将流转换为一个数组</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 15:18.
 */
public class RandInts {
  private static int[] rints =
      new Random(47)
          .ints(0,1000)   // 范围：0~1000
          .limit(100)                                        // 100 个 随机数组成的流
          .toArray();                                        // 转为数组存储到 rints 中
  public static IntStream rands(){
    return Arrays.stream(rints);   // 将数组转为 流
  }
}
