package main.java.cn.zhuyee.method_reference;

/**
 * <h2>构造器方法引用</h2>
 * <p>捕获某个构造器的引用，之后通过该引用来调用那个构造器</p>
 *
 * Created by zhuye on 2022/9/27 23:30.
 */
public class ConstructorReference {
  public static void main(String[] args) {
    // 具体是如何使用 Dog::new 的，这3个构造器都只有一个名字：[::new]
    // 在每种情况下，构造器引用被赋值给了不同的接口，编译器从接口来推断使用哪个构造器
    MakeNoArgs mna = Dog::new;   // 会分别创建构造器，并将构造器引用赋值给接口
    Make1Args m1a = Dog::new;
    Make2Args m2a = Dog::new;

    Dog dn = mna.make();
    Dog d1a = m1a.make1("Pit");
    Dog d2a = m2a.make2("laifu", 3);
  }
}

/**
 * Dog 有3个构造器，一个无参，两个有参
 */
class Dog{
  String name;
  int age = -1;

  Dog(){
    name = "stray";
  }
  Dog(String nm) {
    name = nm;
  }
  Dog(String nm, int yrs) {
    name = nm;
    age = yrs;
  }
}


/**
 * 几个函数式接口中的 make() 方法反映了构造器的参数列表，这里make()方法名称略有不同
 */
interface MakeNoArgs{
  Dog make();
}

interface Make1Args{
  Dog make1(String nm);
}

interface Make2Args{
  Dog make2(String nm, int age);
}
