package cn.zhuyee.array_initialization;

/**
 * <h2>定义可变参数</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 15:44.
 */
public class NewVarArgs {
  static void printArray(Object... args) {
    for (Object obj : args) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // 可传递单个元素
    printArray(47, 3.14f, 11.11);
    printArray("one", "two", "three");
    printArray(new A(), new A(), new A());
    // 传递数组
    printArray((Object) new Integer[]{1, 2, 3, 4, 5});
    // 空参
    printArray();
  }
}
