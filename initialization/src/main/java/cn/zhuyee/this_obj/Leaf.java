package cn.zhuyee.this_obj;

/**
 * <h2>this关键字的简单使用</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/9 23:33.
 */
public class Leaf {
  int i = 0;

  // 通过 this 返回当前对象的引用
  Leaf increment(){
    i++;
    return this;
  }

  void print() {
    System.out.println("i = " + i);
  }

  public static void main(String[] args) {
    Leaf x = new Leaf();
    x.increment().increment().increment().print();
  }
}
