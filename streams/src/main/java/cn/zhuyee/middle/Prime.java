package cn.zhuyee.middle;

import java.util.stream.LongStream;

import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * <h2>移除元素</h2>
 * <ol>
 *   <li>distinct()：移除重复流元素</li>
 *   <li>filter(Predicate)：过滤，只保留符合特定条件的元素</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/6 22:55.
 */
public class Prime {
  /**
   * 过滤函数检查当前数是否是素数
   *
   * @param n
   * @return
   */
  public static boolean isPrime(long n) {
    return rangeClosed(2, (long) Math.sqrt(n))
        .noneMatch(i -> n % i == 0); // 若没有任何一个取余操作的结果为0，则返回true
  }
  public LongStream numbers(){
    return iterate(2, i -> i + 1)
        .filter(Prime::isPrime);
  }

  public static void main(String[] args) {
    new Prime().numbers()
        .limit(10)
        .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    new Prime().numbers()
        .skip(90)
        .limit(10)
        .forEach(n -> System.out.format("%d ", n));
  }
}
