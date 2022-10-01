package cn.zhuyee.functional_interface.more;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * <h2>Title</h2>
 * <p>
 * Created by zhuye on 2022/9/28 23:41.
 */
public class FunctionWithWrapped {
  public static void main(String[] args) {
    Function<Integer,Double> fid = integer -> (double)integer; // 这里必须强转类型，否则编译报错
    IntToDoubleFunction fid2 = i -> i;  // 它是函数式接口的基本类型的变种，存在的目的是防止在传递参数和返回结果时涉及自动装箱|拆箱

  }
}
