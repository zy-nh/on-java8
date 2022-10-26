package cn.zhuyee.this_obj;

/**
 * <h2>通过this将当前对象传递给另一个方法</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/9 23:39.
 */
public class PassingThis {
  public static void main(String[] args) {
    new Person().eat(new Apple());
  }
}
class Person{
  public void eat(Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }
}

class Peeler{
  static Apple peel(Apple apple) {
    // 削皮
    return apple;
  }
}

class Apple{
  Apple getPeeled(){
    return Peeler.peel(this);  // 将当前对象传递给外部类的方法中
  }
}