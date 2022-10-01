package main.java.cn.zhuyee.functional_interface;

import java.util.Comparator;
import java.util.function.*;

/**
 * <h2>方法引用的所有基于类的函数式接口：不涉及基本类型那些</h2>
 * <p>
 * Created by zhuye on 2022/9/28 22:41.
 */
public class ClassFunctionals {
  static AA f1() {
    return new AA();
  }
  static int f2(AA aa1, AA aa2) {
    return 1;
  }
  static void f3(AA aa) {}
  static void f4(AA aa,BB bb){}
  static CC f5(AA aa) {
    return new CC();
  }
  static CC f6(AA aa, BB bb) {
    return new CC();
  }
  static boolean f7(AA aa) {
    return true;
  }
  static boolean f8(AA aa, BB bb) {
    return true;
  }
  static AA f9(AA aa) {
    return new AA();
  }
  static AA f10(AA aa1, AA aa2) {
    return new AA();
  }

  public static void main(String[] args) {
    Supplier<AA> s = ClassFunctionals::f1;
    s.get();

    Comparator<AA> c = ClassFunctionals::f2;
    c.compare(new AA(), new AA());

    Consumer<AA> consumer = ClassFunctionals::f3;
    consumer.accept(new AA());

    BiConsumer<AA,BB> biConsumer = ClassFunctionals::f4;
    biConsumer.accept(new AA(), new BB());

    Function<AA,CC> function = ClassFunctionals::f5;
    CC cc = function.apply(new AA());

    BiFunction<AA,BB,CC> biFunction = ClassFunctionals::f6;
    cc = biFunction.apply(new AA(), new BB());

    Predicate<AA> predicate = ClassFunctionals::f7;
    boolean result = predicate.test(new AA());

    BiPredicate<AA,BB> biPredicate = ClassFunctionals::f8;
    result = biPredicate.test(new AA(), new BB());

    UnaryOperator<AA> unaryOperator = ClassFunctionals::f9;
    AA apply = unaryOperator.apply(new AA());

    BinaryOperator<AA> binaryOperator = ClassFunctionals::f10;
    apply = binaryOperator.apply(new AA(), new AA());
  }
}

class AA{}
class BB{}
class CC{}

