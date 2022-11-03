package cn.zhuyee.use_final;

/**
 * <h2>空白 final</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/27 13:31.
 */
public class BlankFinal {
  private final int i = 0;
  private final int j;//空白 final
  private final Poppet p; // 空白 final 引用
  // 空白 final 字段必须在构造器里面初始化
  public BlankFinal(){
    j = 1;  // 初始化空白 final
    p = new Poppet(1);  // 初始化空白 final 引用
  }
  // 初始化空白 final
  public BlankFinal(int x) {
    j = x;
    p = new Poppet(x);
  }

  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
}
class Poppet{
  private int i;
  Poppet(int ii) {
    i = ii;
  }
}