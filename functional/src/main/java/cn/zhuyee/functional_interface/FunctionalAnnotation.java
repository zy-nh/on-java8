package main.java.cn.zhuyee.functional_interface;

/**
 * <h2>函数式接口</h2>
 *
 * <p>Java8引入了包含一组接口的 java.util.function </p>
 * <p>这些接口是 lambda 表达式和方法引用的目标类型</P>
 * <p>每个接口都只包含一个抽象方法，称为 函数式方法</p>
 * <p>这种函数式方法模式，可使用 @FunctionalInterface 注解来强制实施</p>
 *
 * Created by zhuye on 2022/9/28 0:01.
 */
public class FunctionalAnnotation {
  public String goodbey(String arg) {
    return "Good bey" + arg;
  }

  public static void main(String[] args) {
    FunctionalAnnotation fa = new FunctionalAnnotation();
    /**
     * 这里 f 和 fna 的定义，单步调试可看到具体的内容
     * Functional 和 FunctionalNoAnn 定义了接口，但赋值给它们的只是方法 goodbye，且不是这里定义的某个接口中的方法
     * 这也是Java8的一个小特性：
     * 若将一个方法引用或 lambda 表达式赋值给某个函数式接口（且类型可匹配），那么Java会调整这个赋值，使其匹配目标接口
     * 其底层，Java 编译器会创建一个实现了目标接口的实例，（这里就是指FunctionalAnnotation#goodbye()），并将方法引用或 lambda 表达式包裹在其中
     */
    Functional f = fa::goodbey;
    FunctionalNoAnn fna = fa::goodbey;
//    Functional fac = fa;      // 不兼容
    Functional fl = arg -> "Good bey," + arg;
    FunctionalNoAnn fnal = arg -> "Good bey," + arg;
    System.out.println(fl.goodbey("Functional With Annotation"));
    System.out.println(fnal.goodbey("Functional Without Annotation"));
  }
}

// 使用这个注解的接口也叫做：单一抽象方法
@FunctionalInterface
interface Functional{
  String goodbey(String arg);
}

interface FunctionalNoAnn{
  String goodbey(String arg);
}

/*
@FunctionalInterface
interface NotFunctional{
  String goodbey(String arg);
  String hello(String arg);
}
报错信息：
Multiple non-overriding abstract methods found in interface main.java.cn.zhuyee.functional_interface.NotFunctional
*/
