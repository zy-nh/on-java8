package cn.zhuyee.use_final;

import java.util.Random;

/**
 * <h2>final数据</h2>
 * <p>基本类型-值不可变</p>
 * <p>引用类型-引用不可变</p>
 * <br>
 * Created by zhuye at 2022/10/27 11:39.
 */
public class FinalData {
  private static Random random = new Random(47);
  private String id;
  public FinalData(String id) {
    this.id = id;
  }
  // 可以是编译时常量
  private final int valueOne = 9;
  private static final int VALUE_TWO = 99;
  // 典型的公共常量
  public static final int VALUE_THREE = 39;
  // 这些不能作为编译时常量
  private final int i4 = random.nextInt(20);
  static final int INT_5 = random.nextInt(20);
  private Value v1 = new Value(11);
  private final Value v2 = new Value(22);
  private static final Value VAL_3 = new Value(33);
  // Arrays:
  private final int[] a = { 1, 2, 3, 4, 5, 6 };
  @Override
  public String toString() {
    return id + ": " + "i4 = " + i4
        + ", INT_5 = " + INT_5;
  }
  public static void main(String[] args) {
    FinalData fd1 = new FinalData("fd1");
    //- fd1.valueOne++; // Error: 值无法修改
    fd1.v2.i++; // 对象非恒定不变
    fd1.v1 = new Value(9); // OK -- not final
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++; // 对象非恒定不变
    //- fd1.v2 = new Value(0); // 错误：
    //- fd1.VAL_3 = new Value(1); // 引用不能修改
    //- fd1.a = new int[3];
    System.out.println(fd1);
    System.out.println("Creating new FinalData");
    FinalData fd2 = new FinalData("fd2");
    System.out.println(fd1);
    System.out.println(fd2);
  }
}
class Value{
  int i; // 包访问权限
  Value(int i) {
    this.i = i;
  }
}