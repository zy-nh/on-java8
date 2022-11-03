package cn.zhuyee.inherit_compose;

/**
 * <h2>组合和继承相结合</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 21:05.
 */
class Plate{
  Plate(int i) {
    System.out.println("Plate constructor");
  }
}
class DinnerPlate extends Plate{
  DinnerPlate(int i) {
    super(i);
    System.out.println("DinnerPlate constructor");
  }
}
class Utensil{
  Utensil(int i) {
    System.out.println("Utensil constructor");
  }
}
class Spoon extends Utensil{
  Spoon(int i) {
    super(i);
    System.out.println("Spoon constructor");
  }
}
class Fork extends Utensil{
  Fork(int i) {
    super(i);
    System.out.println("Fork constructor");
  }
}
class Knife extends Utensil{
  Knife(int i) {
    super(i);
    System.out.println("Knife constructor");
  }
}
// 一种做事情的惯用法
class Custom{
  Custom(int i) {
    System.out.println("Custom constructor");
  }
}
public class PlaceSetting extends Custom{
  // 组合了其它类的对象的引用
  private Spoon spoon;
  private Fork fork;
  private Knife knife;
  private DinnerPlate dinnerPlate;

  // 有参构造器来初始化成员
  public PlaceSetting(int i) {
    super(i + 1);  //初始化基类
    spoon = new Spoon(i + 2);
    fork = new Fork(i + 3);
    knife = new Knife(i + 4);
    dinnerPlate = new DinnerPlate(i + 5);
    System.out.println("PlaceSetting constructor");
  }

  public static void main(String[] args) {
    PlaceSetting x = new PlaceSetting(9);
  }
}
