package cn.zhuyee.method_reference;

/**
 * <h2>描述类</h2>
 *
 * Created by zhuye on 2022/9/26 23:18.
 */
public class Describe {
  void show(String msg) {   // [2] show() 的签名（参数类型和返回值）与 Callable#call() 的签名一致
    System.out.println(msg);
  }
}
