package cn.zhuyee.access;

/**
 * <h2>private</h2>
 * <ol>
 *   <li>控制对象的创建方式</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/26 10:52.
 */
public class IceCream {
  public static void main(String[] args) {
    //Sundae sundae = new Sundae(); // 不能直接创造无参构造器对象
    Sundae sundae = Sundae.makeASundae();
  }
}

class Sundae{
  private Sundae(){}

  Sundae(String string) {
    System.out.println(string);
  }
  static Sundae makeASundae(){
    return new Sundae();
  }
}

// 若无参构造器是唯一定义的构造器，且是private的，该类就不能被继承
// 报错：There is no default constructor available in 'cn.zhuyee.access.Sundae'
// 若有多个构造器，无参构造器是私有的时，其它构造器需要在子类做一个适配，否则编译会报错
class Test extends Sundae{

  // 适配父类构造器
  Test(String string) {
    super(string);
  }
}