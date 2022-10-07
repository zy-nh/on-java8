package cn.zhuyee.introduce;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h2>Java 8 对流的支持</h2>
 * <p>Java设计者如何把 流这个新概念 整合到现有库中？
 * 最大问题是 那些用了接口的库，如何在接口中添加新方法而不破坏原有已经实现了该接口的而没实现这个新方法？
 * <li>Java 8 的解决方案是接口中的默认（default）方法，通过默认方法，可以直接把流方法塞进现有类中</li>
 * <li>集合的目的是更好的存储对象，存储的目的是为了处理对象</li>
 * <li>而更好的处理对象的方式是使用流，结合 lambda 表达式 和 方法引用</li>
 * <li>流可以对有状态的系统进行建模，而不需要使用赋值或可变数据</li>
 * <li>声明式编程风格：我们说明想要完成什么（What），而不是指明怎么做（How）</li>
 * <hr>
 * <dl>
 *   <dt>流的操作分类</dt>
 *   <dd>- 创建流</dd>
 *   <dd>- 修改流元素（中间操作）</dd>
 *   <dd>- 消费流元素（终结操作）</dd>
 * </dl>
 *
 * Created by zhuye at 2022/10/1 17:18.
 */
public class Randoms {
  public static void main(String[] args) {
    // 声明式编程：流操作来生成一组在 5~20 的按顺序排列的 7 个数据
    new Random(47)
        .ints(5,20)  // 会生成一个流，参数为所生成值的上下界
        .distinct()                                     // 去重
        .limit(7)                                       // 限制生成的数量为 7
        .sorted()                                       // 对所生成的 7 个数进行排序
        .forEach(System.out::println);                  // 遍历打印这些数

    // 命令式编程
    Random random = new Random(47);
    SortedSet<Integer> rints = new TreeSet<>();
    while (rints.size() < 7) {
      int r = random.nextInt(20);
      if (r < 5) continue;                              // 过滤小于 5 的数
      rints.add(r);
    }
    System.out.println(rints);

  }
}
