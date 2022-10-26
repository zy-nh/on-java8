package cn.zhuyee.use_constructor;

/**
 * <h2>用构造器保证初始化</h2>
 * <ol>
 *   <li>构造器的名字就是类名</li>
 *   <li>构造器分为有参构造和无参构造</li>
 *   <li>构造器是一类特殊的方法，它没有返回类型</li>
 *   <li>new 表达式返回了新建对象的引用</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/8 22:35.
 */
public class Rock {
  // 无参构造器
  Rock(){
    System.out.print("Rock ");
  }
  // 有参构造器
  Rock(int i) {
    System.out.print("Rock_" + i + " ");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Rock();
      new Rock(i);
    }
  }
}
