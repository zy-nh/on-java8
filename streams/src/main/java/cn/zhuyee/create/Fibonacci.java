package cn.zhuyee.create;

import java.util.stream.Stream;

/**
 * <h2>使用 {@link Stream#iterator()} 生成一个 斐波那契数列</h2>
 * {@link Stream#iterator()} 从一个种子开始（第一个参数），然后将其传给第二个参数所引用的方法
 * 其结果被添加到这个流上，并且保存下来作为下一次 iterate() 调用的第一个参数，以此类推。
 * <br>
 * 作用：返回这个流元素的迭代器。是一个终端操作
 * <br>
 * 斐波那契数列：将数列中的最后两个元素相加，生成下一个元素
 *
 * Created by zhuye at 2022/10/2 11:43.
 */
public class Fibonacci {
  int x = 1;
  Stream<Integer> numbers() {
    return Stream.iterate(0, i -> {   // iterate() 只会记住结果，因此必须用 x 来记住另一个元素
      int result = x + i;
      x = i;
      return result;
    });
  }

  public static void main(String[] args) {
    new Fibonacci().numbers()
        .skip(20)   // 跳过前 20 个流元素
        .limit(10)  // 设置流元素个数
        .forEach(System.out::println);  // 遍历时，才会跳到 Stream.iterate()方法的 lambda 表达式中生成所要求的数据
  }
}
