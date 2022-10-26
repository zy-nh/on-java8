package cn.zhuyee.constructor_initialization;

/**
 * <h2>初始化顺序</h2>
 * <p>类中的变量定义顺序决定了初始化顺序</p>
 * <p>先初始化成员变量</p>
 * <p>再初始化构造函数中的数据</p>
 * <br>
 * Created by zhuye at 2022/10/16 10:39.
 */
public class OrderOfInitialization {
  public static void main(String[] args) {
    House h = new House();
    h.f();  // 提示构造过程结束
  }
}

// 调用构造器来创建一个 Window 对象
class Window{
  Window(int marker){
    System.out.println("Window(" + marker + ")");
  }
}

class House{
  Window w1 = new Window(1);   // 在构造器之前
  House(){
    // 提示已经在构造器里了
    System.out.println("House()");
    w3 = new Window(33);      // 重新初始化 w3
  }

  Window w2 = new Window(2);  // 在构造器之后
  void f(){
    System.out.println("f()");
  }

  Window w3 = new Window(3);  // 在尾部

}