package cn.zhuyee.use_final;

/**
 * <h2>final参数</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/27 13:41.
 */
public class FinalArguments {
  void with(final Gizmo gizmo) {
    //gizmo = new Gizmo(); // 非法：gizmo是final的
  }

  void without(Gizmo gizmo) {
    gizmo = new Gizmo();
    gizmo.spin();
  }

  //void f(final int i) { i++; } 不能修改
  // 对一个final基本类型只能执行读操作
  int g(final int i) {
    return i + 1;
  }

  public static void main(String[] args) {
    FinalArguments arguments = new FinalArguments();
    arguments.without(null);
    arguments.with(null);
  }
}
class Gizmo{
  public void spin(){}
}