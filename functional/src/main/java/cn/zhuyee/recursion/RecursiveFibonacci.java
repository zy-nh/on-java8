package cn.zhuyee.recursion;

/**
 * <h2>递归的 lambda 表达式求斐波那契数列</h2>
 *
 * Created by zhuye on 2022/9/26 23:07.
 */
public class RecursiveFibonacci {
  IntCall fib;

  // 使用构造器初始化
  public RecursiveFibonacci() {
    fib = n -> n == 0 ? 0 :                                // 第一项：0
               n == 1 ? 1 :                                // 第二项：1
               fib.call(n - 1) + fib.call(n - 2);  // 从第三项开始，每一项都等于前两项之和
  }
  int fibonacci(int n){
    return fib.call(n);
  }

  public static void main(String[] args) {
    RecursiveFibonacci rf = new RecursiveFibonacci();
    for (int i = 0; i < 10; i++) {
      System.out.println(rf.fibonacci(i));
    }
  }
}
