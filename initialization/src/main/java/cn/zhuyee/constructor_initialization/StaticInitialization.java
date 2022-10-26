package cn.zhuyee.constructor_initialization;

import javafx.scene.control.Tab;

/**
 * <h2>静态数据的初始化</h2>
 * <P>无论创建了多个对象，静态数据都只有一份存储空间</P>
 * <P>static 关键字不能用于静态变量，仅适用于字段（成员变量）</P>
 * <P>static基本类型未初始化，就会获得基本类型的标准初始化</P>
 * <P>static引用类型，默认初始值为 null</P>
 * <li>显式的静态初始化：{@link ExplicitStatic}</li>
 * <P>创建对象的过程，以Dog类为例：</P>
 * <ol>
 *   <li>尽管没有显式使用static关键字，但构造器实际上也是静态方法。第一次创建类型为Dog的对象时，或在第一次访问类Dog的静态方法或静态字段时，Java解释器会搜索类路径来定位Dog.class文件</li>
 *   <li>当Dog.class被加载后，其所有静态初始化工作都会执行。静态初始化只在Class对象首次加载时发生一次</li>
 *   <li>当使用 new Dog() 创建对象时，构建过程首先在堆上为Dog对象分配足够的存储空间</li>
 *   <li>该存储空间会被清空，然后自动将该Dog对象中的所有基本类型设置为其默认值，引用设置为null</li>
 *   <li>执行所有出现在字段定义处的初始化操作</li>
 *   <li>执行构造器</li>
 * </ol>
 *
 * <br>
 * Created by zhuye at 2022/10/16 11:03.
 */
public class StaticInitialization {
  static Table table = new Table();
  static Cupboard cupboard = new Cupboard();

  // 执行静态 main 方法前，必须先加载 StaticInitialization 类，然后初始化它的静态字段 table和cupboard，导致它们对应的类会被加载
  public static void main(String[] args) {
    System.out.println("main creating new Cupboard()");
    new Cupboard();
    System.out.println("main creating new Table()");
    new Cupboard();
    table.f2(1);
    cupboard.f3(1);
  }
}

/* 输出
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
main creating new Cupboard()
Bowl(3)
Cupboard()
f1(2)
main creating new Table()
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)
*/

class Bowl {
  Bowl(int marker) {
    System.out.println("Bowl(" + marker + ")");
  }

  void f1(int marker) {
    System.out.println("f1(" + marker + ")");
  }
}

class Table {
  static Bowl bowl1 = new Bowl(1);

  Table() {
    System.out.println("Table()");
    bowl2.f1(1);
  }

  void f2(int marker) {
    System.out.println("f2(" + marker + ")");
  }

  static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
  Bowl bowl3 = new Bowl(3);
  static Bowl bowl4 = new Bowl(4);

  Cupboard() {
    System.out.println("Cupboard()");
    bowl4.f1(2);
  }

  void f3(int marker) {
    System.out.println("f3(" + marker + ")");
  }

  static Bowl bowl5 = new Bowl(5);
}