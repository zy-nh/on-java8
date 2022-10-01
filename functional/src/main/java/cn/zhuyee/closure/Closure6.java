package main.java.cn.zhuyee.closure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * <h2>换为List可以通过</h2>
 * <p>
 * Created by zhuye on 2022/9/29 22:50.
 */
public class Closure6 {
  Supplier<List<Integer>> makeFun(){
    // 每次调用 makeFun() 时，都会创建一个全新的 ArrayList，是非共享的
    final List<Integer> ai = new ArrayList<>();
    ai.add(1);
    // 将 ai 重新指向另一个对象，就会编译不通过
//    ai = new ArrayList<>();
    return () -> ai;
  }

  public static void main(String[] args) {
    Closure6 closure6 = new Closure6();
    List<Integer> l1;
    List<Integer> l2;
    l1 = closure6.makeFun().get();
    l2 = closure6.makeFun().get();
    System.out.println(l1);
    System.out.println(l2);
    l1.add(42);
    l2.add(98);
    System.out.println(l1);
    System.out.println(l2);
  }
}
