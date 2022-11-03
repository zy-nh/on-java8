package cn.zhuyee.delegation;

/**
 * <h2>构造太空船</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 18:41.
 */
public class DerivedSpaceShip extends SpaceShipControls {
  private String name;

  public DerivedSpaceShip(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  public static void main(String[] args) {
    DerivedSpaceShip protector = new DerivedSpaceShip("NSEA Protector");
    protector.forward(100);
  }
}
