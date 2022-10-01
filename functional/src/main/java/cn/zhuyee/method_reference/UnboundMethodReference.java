package cn.zhuyee.method_reference;

/**
 * <h2>未绑定对象的方法引用</h2>
 *
 * <p>指的是尚未关联到某个对象的普通（非静态）方法</p>
 * <p>对于未绑定引用，必须先提供对象，才能使用</p>
 *
 * Created by zhuye on 2022/9/27 22:10.
 */
public class UnboundMethodReference {
  public static void main(String[] args) {
    // MakeString ms = X::f;                // [1] 这里对 X 中的 f() 做方法引用，将其赋值给 MakeString，但编译器报错，尽管 make() 的签名与 f() 相同，因为这里有隐含参数 this
    TransformX sp = X::f;                   // 在 TransformX#transform(X x)，通过传入 X 对象的引用来调用该方法，因此，需要一个 X 对象，才能调用 f()
    X x = new X();

    System.out.println(sp.transform(x));    // [2] 接受了未绑定引用 X::f()，以 X 为参数，在其上调用了 transform()，最终以某种形式调用了 f()
    System.out.println(x.f());              // 效果一样

    MakeString ms = x::f;                   // [3] 通过创建的 X 对象，用 对象名::方法名 方式的方法引用，可赋值给 MakeString
    System.out.println(ms.make());          // 能否调用？肯定

    /**
     * 输出：
     * X::f()
     * X::f()
     * X::f()
     */
  }
}

class X{
  // 普通方法
  String f(){
    return "X::f()";
  }
}

interface MakeString{
  String make();
}

interface TransformX{
  String transform(X x);
}
