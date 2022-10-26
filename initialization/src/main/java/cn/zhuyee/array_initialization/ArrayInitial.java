package cn.zhuyee.array_initialization;

import java.util.Arrays;

/**
 * <h2>数组初始化</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 15:26.
 */
public class ArrayInitial {
  public static void main(String[] args) {
    // 使用自动装箱，将int转为Integer类型。这两种情况下，初始值列表最后的逗号是可选的
    Integer[] a = {1, 2, 3,};                  // [1] 这种方式局限性大，只能用在定义数组的时候
    Integer[] b = new Integer[]{1, 2, 3, 4,};  // [2] 可以在任何地方使用这种形式，甚至是方法调用中
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}
