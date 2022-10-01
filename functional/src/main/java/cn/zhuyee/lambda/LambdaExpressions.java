package main.java.cn.zhuyee.lambda;

/**
 * <h2>Lambda表达式的使用</h2>
 *
 * Created by zhuye on 2022/9/26 22:33.
 */
public class LambdaExpressions {
  static Body body = head -> head + "No Parens!";       // [1] 只有一个参数时，只写参数，省略括号
  static Body body2 = (head) -> head + "More details";  // [2] 通常是用括号将参数包裹起来
  static Description desc = () -> "Short info";         // [3] 没有参数时，必须用括号来指示空参
  static Multi multi = (head, d) -> head + d;           // [4] 多个参数时，用括号包裹

  static Description moreLines = () -> {                // [5] 多行代码时，用大括号包裹，需要使用 return 从 lambda 表达式中生成一个值
    System.out.println("moreLines()");
    return "from moreLines()";
  };

  public static void main(String[] args) {
    System.out.println(body.detailed("Oh!"));
    System.out.println(body2.detailed("Hi!"));
    System.out.println(desc.brief());
    System.out.println(multi.twoArg("Pi!", 3.1415926));
    System.out.println(moreLines.brief());

    /**
     * 输出
     * Oh!No Parens!
     * Hi!More details
     * Short info
     * Pi!3.1415926
     * moreLines()
     * from moreLines()
     */
  }
}

// 描述
interface Description{
  // 简要方式
  String brief();
}

// 主体
interface Body{
  // 详细的方式
  String detailed(String head);
}

// 更多
interface Multi{
  // 两个参数
  String twoArg(String head, Double d);
}