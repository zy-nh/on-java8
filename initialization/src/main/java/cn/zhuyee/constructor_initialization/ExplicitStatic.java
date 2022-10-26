package cn.zhuyee.constructor_initialization;

/**
 * <h2>显式的静态初始化</h2>
 * <p>将多个静态初始化语句放在一个静态块中，该静态块只会执行一次：</p>
 * <p>即，在第一次创建该类的对象时，或第一次访问该类的静态成员时</p>
 * <br>
 * Created by zhuye at 2022/10/16 12:05.
 */
public class ExplicitStatic {
  public static void main(String[] args) {
    System.out.println("Inside main()");
    Cups.cup1.f(99);                  // [1] 访问静态对象 cup1
  }
  // static Cups cups1 = new Cups();  // [2]
  // static Cups cups2 = new Cups();  // [2]
}

class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup cup1;
  static Cup cup2;
  // 静态块进行初始化
  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups()");
  }
}