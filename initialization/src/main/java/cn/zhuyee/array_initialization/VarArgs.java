package cn.zhuyee.array_initialization;

/**
 * <h2>可变参数列表</h2>
 * 由于所有类最终都继承自公共根类 Object，可以创建一个接受 Object 数组的方法
 * <br>
 * Created by zhuye at 2022/10/16 15:35.
 */
public class VarArgs {
  static void printArray(Object[] args) {
    for (Object obj : args) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    printArray(new Object[]{
        47, (float) 3.14, 11.11
    });
    printArray(new Object[]{"onw", "two", "three"});
    printArray(new Object[]{new A(),new A(),new A()});
  }
}

class A{}