package cn.zhuyee.inheritance;

/**
 * <h2>继承</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 16:52.
 */
public class Detergent extends Cleanser {
  // 重写父类方法:
  @Override
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // 调用父类版本该方法【super关键字指代当前类继承的基类】
  }
  // 添加新的方法:
  public void foam() { append(" foam()"); }
  // 测试新类:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class:");
    Cleanser.main(args);
  }
}

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  @Override
  public String toString() { return s; }

  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    System.out.println(x);
  }
}