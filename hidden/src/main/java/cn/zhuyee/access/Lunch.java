package cn.zhuyee.access;

/**
 * <h2>类的访问权限</h2>
 * <p>演示类的访问权限修饰符</p>
 * <p>通过私有的构造器，让类的对象创建保持私有</p>
 * <br>
 * Created by zhuye at 2022/10/26 14:44.
 */
public class Lunch {
  void testPrivate(){
    // 不能按下面方式创建对象，因为构造器是私有的
    //Soup1 soup1 = new Soup1();
  }
  void testStatic(){
    Soup1 soup1 = Soup1.makeSoup();
  }
  void testSingleton(){
    Soup2.access().f();
  }
}

class Soup1{
  private Soup1(){}
  public static Soup1 makeSoup(){                // [1] 通过静态方法来创建对象
    return new Soup1();
  }
}

class Soup2{
  private Soup2(){}
  // 单例模式【从始至终就只有一个对象被创建，节省内存】
  private static Soup2 ps1 = new Soup2();        // [2] 创建一个静态对象，并在用户请求时返回这个对象的引用
  // 调用该方法来获取静态对象（Soup2的对象作为Soup2的静态私有成员被创建的，有且仅有一个）
  public static Soup2 access(){
    return ps1;
  }
  public void f(){}
}