package cn.zhuyee.array_initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * <h2>动态数组</h2>
 * <p>编写程序时不知道数组需要多少个元素，该怎么办？</p>
 * <p>使用new来创建</p>
 * <br>
 * Created by zhuye at 2022/10/16 15:05.
 */
public class ArrayNew {
  public static void main(String[] args) {
    // 创建数组
    int[] a;
    Random random = new Random(47);
    // 通过随机数在运行时定义数组大小，并给数组初始化
    a = new int[random.nextInt(20)];

    // 在同一个语句中定义和初始化数组
    int[] b = new int[random.nextInt(20)];

    System.out.println("length of a = " + a.length);
    System.out.println(Arrays.toString(a));
  }
}
