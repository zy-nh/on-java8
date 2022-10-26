package cn.zhuyee.array_initialization;

/**
 * <h2>动态数组</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 15:30.
 */
public class DynamicArray {
  public static void main(String[] args) {
    // 创建一个String对象数组，传递给另一个类的main方法。该方法的参数是在方法调用时创建的
    Other.main(new String[]{"fiddle", "de", "dum"});
  }
}

class Other{
  public static void main(String[] args) {
    for (String s : args)
      System.out.print(s + " ");
  }
}