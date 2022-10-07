package cn.zhuyee.end;

import static cn.zhuyee.end.RandInts.rands;

/**
 * <h2>选择一个元素</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/7 16:26.
 */
public class SelectElement {
  public static void main(String[] args) {
    // findFirst() 总是选择流中的第一个元素，不管该流是否为并行的
    System.out.println(rands().findFirst().getAsInt());
    System.out.println(rands().parallel().findFirst().getAsInt());
    // 对于非并行的流，即未使用 parallel()的，findAny()会选择第一个元素
    System.out.println(rands().findAny().getAsInt());
    System.out.println(rands().parallel().findAny().getAsInt());
  }
}
