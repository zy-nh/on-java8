package cn.zhuyee.enum_type;

/**
 * <h2>简单使用枚举</h2>
 * <p>创建enum时，编译器会自动添加一些有用的功能</p>
 * <li>{@link Spiciness#toString()}方法，便于显式显式 enun 实例的名字，详见{@link SimpleEnumUse#toStr(Spiciness)}</li>
 * <li>{@link Spiciness#ordinal()}方法，来表示特定 enum 常量的声明顺序，详见{@link SimpleEnumUse#enumOrder()}</li>
 * <li>{@link Spiciness#values()}方法，它按照声明顺序生成一个 enum 常量值的数组</li>
 * <p>enum 另一个特性是可以在 switch 语句中使用</p>
 * <br>
 * Created by zhuye at 2022/10/16 16:26.
 */
public class SimpleEnumUse {
  public static void main(String[] args) {
    Spiciness howHot = Spiciness.MEDIUM;
    toStr(howHot);
    enumOrder();
  }

  static void toStr(Spiciness spiciness) {
    System.out.println(spiciness.toString());
  }

  static void enumOrder() {
    for (Spiciness s : Spiciness.values()) {
      System.out.println(s + ", ordinal " + s.ordinal());
    }
  }
}
