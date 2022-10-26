package cn.zhuyee.method_overload;

/**
 * <h2>方法重载</h2>
 * <P>不同参数类型和不同返回值类型的方法，具有相同的方法名称</P>
 * <P>重载构造器和重载方法</P>
 * <br>
 * Created by zhuye at 2022/10/8 22:47.
 */
public class Overloading {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      Tree tree = new Tree(i);
      tree.info();
      tree.info("overloaded method");
    }

    // 调用重载构造器
    new Tree();
  }
}

class Tree{
  int height;
  Tree(){
    System.out.println("Planting a seedling");
    height = 0;
  }

  Tree(int initialHeight) {
    height = initialHeight;
    System.out.println("Creating new Tree that is "+height+" feet tall");
  }
  void info(){
    System.out.println("Tree is " + height + " feet tall");
  }

  void info(String s) {
    System.out.println(s + ": Tree is " + height + " feet tall");
  }
}