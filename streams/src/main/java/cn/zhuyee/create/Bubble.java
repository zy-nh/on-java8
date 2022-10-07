package cn.zhuyee.create;

/**
 * <h2>Bubble</h2>
 * 包含自己的静态生成器方法
 * <br>
 * Created by zhuye at 2022/10/1 18:10.
 */
public class Bubble {
  public final int i;

  public Bubble(int n) {
    i = n;
  }

  @Override
  public String toString() {
    return "Bubble(" + i + ')';
  }

  private static int count;
  public static Bubble bubbler() {
    return new Bubble(count++);
  }
}
