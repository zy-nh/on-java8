package main.java.cn.zhuyee.recursion;

/**
 * <h2>递归方法求阶乘</h2>
 *
 * Created by zhuye on 2022/9/26 23:00.
 */
public class RecursiveFactorial {

  static IntCall fact;

  public static void main(String[] args) {
    // 静态变量：阶乘算子公式（注意不能在定义时就初始化）
    fact = n -> n == 0 ? 1 : n * fact.call(n - 1);

    for (int i = 0; i < 10; i++) {
      System.out.println(fact.call(i));
    }

    /**
     * 输出：
     * 1
     * 1
     * 2
     * 6
     * 24
     * 120
     * 720
     * 5040
     * 40320
     * 362880
     */
  }
}
