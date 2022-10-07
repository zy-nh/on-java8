package cn.zhuyee.end;

import static cn.zhuyee.end.RandInts.rands;

/**
 * <h2>获得数值化流相关的信息</h2>
 * <ol>
 *   <li>average() 平均值</li>
 *   <li>max() 最大值</li>
 *   <li>min() 最小值</li>
 *   <li>sum() 将流中的数值累加起来</li>
 *   <li>summaryStatistics() 返回可能有用的摘要数据</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/7 16:36.
 */
public class NumericStreamInfo {
  public static void main(String[] args) {
    System.out.println(rands().average().getAsDouble());
    System.out.println(rands().max().getAsInt());
    System.out.println(rands().min().getAsInt());
    System.out.println(rands().sum());
    System.out.println(rands().summaryStatistics());
  }
}