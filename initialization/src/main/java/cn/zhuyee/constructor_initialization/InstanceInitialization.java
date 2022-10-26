package cn.zhuyee.constructor_initialization;

/**
 * <h2>非静态实例初始化，也称为实例初始化</h2>
 * <p>用于初始化每个对象的非静态变量，实例初始化子句在构造器之前执行</p>
 *
 * <br>
 * Created by zhuye at 2022/10/16 12:27.
 */
public class InstanceInitialization {
  public static void main(String[] args) {
    System.out.println("Inside main()");
    new Mugs();
    System.out.println("new Mugs() completed");
    new Mugs(1);
    System.out.println("new Mugs(1) completed");
  }
}

class Mug {
  Mug(int marker) {
    System.out.println("Mug(" + marker + ")");
  }
}


class Mugs {
  // 非静态变量
  Mug mug1;
  Mug mug2;

  // 这种语法对于支持匿名内部类的初始化是必须的
  {                                         // [1] 除了缺少static关键字外，实例初始化子句与静态初始化子句完全相同
    mug1 = new Mug(1);
    mug2 = new Mug(2);
    System.out.println("mug1 & mug2 initialized");
  }

  Mugs() {
    System.out.println("Mugs()");
  }

  Mugs(int i) {
    System.out.println("Mugs(int)");
  }

}