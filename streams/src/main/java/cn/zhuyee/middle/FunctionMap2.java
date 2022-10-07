package cn.zhuyee.middle;

import java.util.stream.Stream;

/**
 * <h2>将数值类型转为 Numbered 类型</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/6 23:17.
 */
public class FunctionMap2 {

  public static void main(String[] args) {
    Stream.of(1, 3, 5, 7, 9, 11, 13)     // 初始化创建的是 int 类型
        .map(Numbered::new)              // 使用构造器 Numbered::new 将其转为 Numbered 类型
        .forEach(System.out::println);
  }
}
class Numbered{
  final int n;
  Numbered(int n){
    this.n = n;
  }

  @Override
  public String toString() {
    return "Numbered(" + n + ')';
  }
}