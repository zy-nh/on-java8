package cn.zhuyee.create;

import java.util.Arrays;

/**
 * <h2>Arrays 中的静态方法 stream() </h2>
 * {@link java.util.Arrays#stream(Object[])}，将数组转为流
 * <br>
 * Created by zhuye at 2022/10/2 13:12.
 */
public class MetaWork2 {
  public static void main(String[] args) {
    Arrays.stream(new Operation[]{              // 该表达式动态创建了一组由 Operation 对象组成的类型化数组
        () -> Operation.show("Heat"),
        () -> Operation.show("Hammer"),
        () -> Operation.show("Twist"),
        () -> Operation.show("Anneal")
    }).forEach(Operation::execute);
  }
}
