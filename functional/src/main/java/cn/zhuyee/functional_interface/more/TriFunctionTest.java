package main.java.cn.zhuyee.functional_interface.more;

/**
 * <h2>Title</h2>
 * <p>
 * Created by zhuye on 2022/9/28 23:09.
 */
public class TriFunctionTest {
  static int f(int i, long l, double d) {
    return (int) (i+l+d);
  }

  public static void main(String[] args) {
    TriFunction<Integer,Long,Double,Integer> tf = TriFunctionTest::f;
    tf = (i,l,d) -> 12;
    Integer apply = tf.apply(1, 9L, 33.55);
    System.out.println(apply);
  }
}
