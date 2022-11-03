package cn.zhuyee.inherit_compose;

/**
 * <h2>protected关键字</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/27 9:15.
 */
public class Orc extends Villain{
  private int orcNumber;

  public Orc(String name, int orcNumber) {
    super(name);
    this.orcNumber = orcNumber;
  }

  public void change(String name, int orcNumber) {
    set(name); // 方法可以，因为是 protected 的
    this.orcNumber = orcNumber;
  }

  @Override
  public String toString() {
    return "Orc " + orcNumber + ": " + super.toString();
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Linda", 15);
    System.out.println(orc);
    orc.change("Bob", 19);
    System.out.println(orc);
  }
}
class Villain{
  private String name;

  protected void set(String nm) {
    name = nm;
  }

  Villain(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a Villain and my name is " + name;
  }
}