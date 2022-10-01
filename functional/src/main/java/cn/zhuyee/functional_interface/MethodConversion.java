package main.java.cn.zhuyee.functional_interface;

import java.util.function.BiConsumer;

/**
 * <h2>Title</h2>
 * <p>
 * Created by zhuye on 2022/9/28 22:29.
 */
public class MethodConversion {

  // 下面两个方法的参数类型和返回类型都一样，只有方法名不同
  // Java 会将我们起的名字映射到接口的函数式方法上
  static void accept(In1 in1, In2 in2) {
    System.out.println("accept()");
  }
  static void someOtherName(In1 in1, In2 in2) {
    System.out.println("someOtherName()");
  }

  public static void main(String[] args) {
    BiConsumer<In1,In2> bic;           // 接口的函数式方法为：accept()

    // 要调用我们的方法，就要调用这个函数式方法的名字，而不是我们写的方法
    bic = MethodConversion::accept;
    bic.accept(new In1(), new In2());

    bic = MethodConversion::someOtherName;
    bic.accept(new In1(),new In2());  // 这里bic调用不了someOtherName方法，因为BiConsumer的函数式方法是accept()

    //

  }
}

class In1{}
class In2{}