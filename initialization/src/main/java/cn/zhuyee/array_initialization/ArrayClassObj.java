package cn.zhuyee.array_initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * <h2>引用类型数组</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 15:12.
 */
public class ArrayClassObj {
  public static void main(String[] args) {
    Random random = new Random(47);
    Integer[] a = new Integer[random.nextInt(20)];
    System.out.println("length of a = " + a.length);
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(500); // 自动装箱，直到自动装箱完成，才算完成初始化
    }
    System.out.println(Arrays.toString(a));
  }
}
