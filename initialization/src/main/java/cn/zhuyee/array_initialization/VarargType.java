package cn.zhuyee.array_initialization;

/**
 * <h2>可变参数列表转为数组</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/16 16:02.
 */
public class VarargType {
  static void f(Character... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }

  static void g(int... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }

  public static void main(String[] args) {
    f('a');
    f();
    g(1);
    g();
    System.out.println("int[]: " + new int[0].getClass());
  }
}
