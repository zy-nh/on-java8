package cn.zhuyee.this_obj;

/**
 * <h2>在构造器中调用构造器</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/11 22:31.
 */
public class Flower {
  int petalCount = 0;
  String s = "initial value";

  Flower(int petals) {
    petalCount = petals;
    System.out.println(
        "Constructor w/ int arg only, petalCount= " + petalCount
    );
  }

  Flower(String ss) {
    System.out.println(
        "Constructor w/ String arg only, s= " + ss
    );
  }

  Flower(String s, int petals) {
    this(petals);
    // 不能同时调用两个构造器
    this.s = s;
    System.out.println("String & int");
  }

  Flower(){
    this("hi", 88);
    System.out.println("Zero-argument constructor");
  }

  void printPetalCount(){
    //this(11)  不能在非构造器里使用
    System.out.println("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    Flower x = new Flower();
    x.printPetalCount();
  }
}
