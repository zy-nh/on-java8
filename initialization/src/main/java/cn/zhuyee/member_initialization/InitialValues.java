package cn.zhuyee.member_initialization;

/**
 * <h2>成员初始化</h2>
 * <p>类的每个基本类型字段都会有获得一个初始值</p>
 * <P>自动初始化：编译器会给未初始化的变量赋一个默认值【这个动作早于构造器】</P>
 * <P>Java编译器不支持向前引用，所有变量需要先初始化再使用</P>
 * <P>对于成员变量的初始化，可通过构造器来进行</P>
 * <br>
 * Created by zhuye at 2022/10/16 0:03.
 */
public class InitialValues {

  // 定义变量时初始化
  boolean t = true;
  char c = 'Z';
  byte b = 47;
  short s = 0xff;
  int i = 888;
  long l = 1;
  float f = 3.14f;
  double d = 3.1415926;

  InitialValues reference;

  void printInitialValues(){
    System.out.println("Data type   Initial value");
    System.out.println("boolean     " + t);
    System.out.println("char        [" + c + "]");
    System.out.println("byte        " + b);
    System.out.println("short       " + s);
    System.out.println("int         " + i);
    System.out.println("long        " + l);
    System.out.println("float       " + f);
    System.out.println("double      " + d);
    System.out.println("reference   " + reference);
  }

  public static void main(String[] args) {
    new InitialValues().printInitialValues();
  }
}
/*输出
Data type   Initial value
boolean     false
char        [ ]
byte        0
short       0
int         0
long        0
float       0.0
double      0.0
reference   null
 */