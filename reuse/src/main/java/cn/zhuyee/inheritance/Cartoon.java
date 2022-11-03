package cn.zhuyee.inheritance;

/**
 * <h2>继承时调用构造器</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 17:23.
 */
class Art{
  Art(){
    System.out.println("Art constructor");
  }
}

class Drawing extends Art{
  Drawing(){
    System.out.println("Drawing constructor");
  }
}

public class Cartoon extends Drawing{
  public Cartoon(){
    System.out.println("Cartoon constructor");
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
}
