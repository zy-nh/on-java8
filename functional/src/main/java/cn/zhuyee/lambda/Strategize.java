package main.java.cn.zhuyee.lambda;


public class Strategize {

    Strategy strategy;
    String msg;

    Strategize(String msg) {
      strategy = new Soft();                // [1] 接口引用，接受其实现类的对象，默认接受 Soft 对象
      this.msg = msg;
    }

    void communicate() {
      System.out.println(strategy.approach(msg));
    }
    void changeStrategy(Strategy strategy) {
      this.strategy = strategy;
    }

    public static void main(String[] args) {
      Strategy[] strategies = {
          new Strategy() {                    // [2] 创建匿名内部类方式，实现其接口
            public String approach(String msg) {
              return msg.toUpperCase() + "!";
            }
          },
          msg -> msg.substring(0, 5),         // [3] lambda 表达式，与匿名内部类方式效果一样
          Unrelated::twice                    // [4] 方法引用，::左边为类名|对象名，右边为方法名，不含参数列表
      };

      Strategize s = new Strategize("Hello there");
      s.communicate();

      // 遍历所有策略
      for(Strategy newStrategy : strategies) {
        s.changeStrategy(newStrategy);      // [5] 将每个策略放入 s 中
        s.communicate();                    // [6] 每次调用该方法都会产生不同的行为，取决于此时使用的策略
      }

      /**
       * 输出：
       * hello there?
       * HELLO THERE!
       * Hello
       * Hello there Hello there
       */
    }

}

// 接口：含唯一方法
interface Strategy{
  String approach(String msg);
}

// 接口实现类：实现接口方法
class Soft implements Strategy{
  @Override
  public String approach(String msg) {
    return msg.toLowerCase() + "?";
  }
}

// 无关
class Unrelated{
  static String twice(String msg) {
    return msg + " " + msg;
  }
}