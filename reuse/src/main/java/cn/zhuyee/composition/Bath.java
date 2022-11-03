package cn.zhuyee.composition;

/**
 * <h2>初始化引用的4种方法</h2>
 * <ol>
 *   <li>在定义对象时</li>
 *   <li>在该类的构造器中</li>
 *   <li>在对象实际使用之前</li>
 *   <li>使用实例初始化</li>
 * </ol>
 *
 * <br>
 * Created by zhuye at 2022/10/26 16:34.
 */
public class Bath {
  private String // 定义时初始化：Initializing at point of definition:
      s1 = "Happy",
      s2 = "Happy",
      s3, s4;
  private Soap castile;
  private int i;
  private float toy;
  // 构造器中初始化
  public Bath() {
    System.out.println("Inside Bath()");
    s3 = "Joy";
    toy = 3.14f;
    castile = new Soap();
  }
  // 实例初始化：Instance initialization:
  { i = 47; }
  @Override
  public String toString() {
    if(s4 == null) // 延迟初始化：Delayed initialization:
      s4 = "Joy";
    return
        "s1 = " + s1 + "\n" +
            "s2 = " + s2 + "\n" +
            "s3 = " + s3 + "\n" +
            "s4 = " + s4 + "\n" +
            "i = " + i + "\n" +
            "toy = " + toy + "\n" +
            "castile = " + castile;
  }

  public static void main(String[] args) {
    Bath b = new Bath();
    System.out.println(b);
  }
}

class Soap {
  private String s;
  Soap() {
    System.out.println("Soap()");
    s = "Constructed";
  }
  @Override
  public String toString() { return s; }
}