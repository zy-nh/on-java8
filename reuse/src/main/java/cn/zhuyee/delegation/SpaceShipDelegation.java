package cn.zhuyee.delegation;

/**
 * <h2>通过委托来解决</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 19:07.
 */
public class SpaceShipDelegation {
  private String name;
  private SpaceShipControls controls = new SpaceShipControls();

  public SpaceShipDelegation(String name) {
    this.name = name;
  }

  // 委托方法
  public void back(int velocity) {
    controls.back(velocity);
  }
  public void down(int velocity) {
    controls.down(velocity);
  }
  public void forward(int velocity) {
    controls.forward(velocity);
  }
  public void left(int velocity) {
    controls.left(velocity);
  }
  public void right(int velocity) {
    controls.right(velocity);
  }
  public void turboBoost() {
    controls.turboBoost();
  }
  public void up(int velocity) {
    controls.up(velocity);
  }

  public static void main(String[] args) {
    SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
    protector.forward(100);
  }
}
