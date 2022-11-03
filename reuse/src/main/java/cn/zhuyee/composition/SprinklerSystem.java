package cn.zhuyee.composition;

/**
 * <h2>组合语法</h2>
 * <p>对于非基本类型的对象，将其引用放入新类中</p>
 * <p>对于基本类型，在新类中直接定义</p>
 * <br>
 * Created by zhuye at 2022/10/26 16:19.
 */
public class SprinklerSystem {
  private String value1,value2,value3,value4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;

  @Override
  public String toString() {
    return "SprinklerSystem{" +
        "value1='" + value1 + '\'' +
        ", value2='" + value2 + '\'' +
        ", value3='" + value3 + '\'' +
        ", value4='" + value4 + '\'' +
        ", source=" + source +
        ", i=" + i +
        ", f=" + f +
        '}';
  }

  public static void main(String[] args) {
    SprinklerSystem sprinklers = new SprinklerSystem();
    System.out.println(sprinklers);
  }
}

class WaterSource{
  private String s;
  WaterSource(){
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  @Override
  public String toString() {
    return s;
  }
}
