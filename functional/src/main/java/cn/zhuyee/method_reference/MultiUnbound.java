package main.java.cn.zhuyee.method_reference;

/**
 * <h2>方法有多个参数，只要遵循（接口方法）第一个参数取的是 this 这种模式</h2>
 *
 * Created by zhuye on 2022/9/27 22:41.
 */
public class MultiUnbound {
  public static void main(String[] args) {
    NoneArgs noneArgs = This::none;         // [1] 尽管这里没穿参数，但接口方法默认取的第一个参数是 this，也就是这里的类 This，因此接口方法需要定义参数 This
    OneArgs oneArgs = This::one;
    TwoArgs twoArgs = This::two;
    ThreeArgs threeArgs = This::three;
    FourArgs fourArgs = This::four;

    This athis = new This();
    noneArgs.call(athis);
    oneArgs.call1(athis, 11);
    twoArgs.call2(athis, 12, 3.14);
    threeArgs.call3(athis, 13, 3.1415, "three");
    fourArgs.call4(athis, 14, 3.1415, "four", 'Z');
  }
}

// 含不同参数的方法
class This{
  void none(){}
  void one(int i) {}
  void two(int i, double d){}
  void three(int i,double d,String s){}
  void four(int i,double d,String s,char c){}
}

// 0个参数的接口
interface NoneArgs{
  void call(This athis);
}

// 1个参数的接口
interface OneArgs{
  void call1(This athis, int i);
}

// 2个参数的接口
interface TwoArgs{
  void call2(This athis, int i, double d);
}

// 3个参数的接口
interface ThreeArgs{
  void call3(This athis, int i, double d, String s);
}

// 4个参数的接口
interface FourArgs{
  void call4(This athis, int i, double d, String s, char c);
}