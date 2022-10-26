package cn.zhuyee.new_type_inference;

/**
 * <h2>局部变量类型推断</h2>
 * <p>JDK 11提供了一个用来简化局部变量定义的特性：
 * 在一个局部定义中，编译器会自动发现类型，这就是类型推断</p>
 * <p>通过关键字 var 来启用它</p>
 * <p>静态方法也允许类型推断，即在方法定义时使用该关键字</p>
 * <p>类型推断不能用于方法的参数</p>
 * <p>类型推断适用于for循环</p>
 * <br>
 * Created by zhuye at 2022/10/16 17:18.
 */
public class TypeInference {
  void method(){
    // 显式类型
    String hello1 = "hello";
    // 类型推断
    //var hello = "hello!";
  }
}
class Plumbus{}

class NoInference{
  String field1 = "Field initialization";
}