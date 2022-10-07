package cn.zhuyee.create;

import java.util.Random;
import java.util.stream.Stream;

/**
 * <h2>Random类增强，有一组可以生成流的方法</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/1 21:23.
 */
public class FandomGennerators {
  /**
   * 泛型方法，为了消除冗余代码
   * 类型参数T，可以是任何东西，如这里使用的Integer、Long、Double
   * boxed() 流操作会自动将基本类型转换为对应的包装器类型
   *
   * @param stream
   * @param <T>
   */
  public static <T> void show(Stream<T> stream) {
    stream.limit(4)
        .forEach(System.out::println);
    System.out.println("++++++++");
  }

  public static void main(String[] args) {
    Random random = new Random(47);
    show(random.ints().boxed());
    show(random.longs().boxed());
    show(random.doubles().boxed());
    // 控制上下边界
    show(random.ints(10, 20).boxed());
    show(random.longs(50, 100).boxed());
    show(random.doubles(20, 30).boxed());
    // 控制流的大小
    show(random.ints(2).boxed());
    show(random.longs(2).boxed());
    show(random.doubles(2).boxed());
    // 控制流的大小和边界
    show(random.ints(3,3, 8).boxed());
    show(random.longs(3,13, 35).boxed());
    show(random.doubles(3,15.5, 18.6).boxed());
  }
}
