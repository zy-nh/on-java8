package cn.zhuyee.this_obj;

/**
 * <h2>this 关键字</h2>
 * <ol>
 *   <li>想在一个方法里获得对当前对象的引用，可以直接使用this关键字，它表示对当前对象的引用</li>
 *   <li>this 关键字只能在非静态方法中使用</li>
 *   <li>类中的非静态方法都有一个隐藏参数this，位于所有显式参数之前，代表着被操作对象的引用</li>
 *   <li>同一个类中的一个方法调用另一个方法，可省略this，直接调用</li>
 *   <li>当前方法里的this引用会自动应用于同一类中的其它方法，如：{@link Leaf}</li>
 *   <li>this关键字还可以将当前对象传递给另一个方法，如：{@link PassingThis}</li>
 *   <li>通过this关键字实现在构造器中调用构造器</li>
 * </ol>
 * <br>
 * Created by zhuye at 2022/10/9 23:09.
 */
public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
        b = new Banana();
    // a、b两个对象调用peel()方法，这个方法怎么知道被哪个对象调用
    a.peel(1);
    b.peel(2);
    // 实际方法调用方式
    //Banana.peel(a, 1);
    //Banana.peel(b, 1);
  }
}
class Banana{
  void peel(int i) {
    System.out.println(i);
  }
}