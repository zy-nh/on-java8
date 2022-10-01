package main.java.cn.zhuyee.combine_function;

import java.util.function.Function;

/**
 * <h2>函数组合：将多个函数结合使用，以创建新的函数</h2>
 *
 * <li>andThen(argument) 先执行原始操作，再执行参数操作</li>
 * <li>compose(argument) 先执行参数操作，再执行原始操作</li>
 * <li>and(argument) 原始谓词和参数谓词执行 与运算</li>
 * <li>or(argument) 原始谓词和参数谓词执行 或运算</li>
 * <li>negate() 所得谓词为该谓词的 逻辑取反</li>
 *
 * Created by zhuye on 2022/9/30 0:19.
 */
public class FunctionComposition {

  static Function<String, String>
      f1 = s -> {
        System.out.println(s);
        return s.replace('A', '_');
      },
      f2 = s -> s.substring(3),
      f3 = s -> s.toLowerCase(),
      f4 = f1.compose(f2).andThen(f3);  // 调用顺序：先调用 f2，再调用 f1，接着调用 f3，最后赋值给 f4

  public static void main(String[] args) {
    // 使用 apply 来调用我们创建的函数 f4
    System.out.println(f4.apply("GO AFTER ALL AMBULANCES"));
  }
}
