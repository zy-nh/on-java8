package cn.zhuyee.inheritance;

/**
 * <h2>带产生的构造器</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/26 17:33.
 */
class Game{
  Game(int i) {
    System.out.println("Game constructor");
  }
}
class BoardGame extends Game{
  BoardGame(int i) {
    super(i);  // 这里必须显式调用基类构造器，否则编译报错
    System.out.println("BoardGame constructor");
  }
}
public class Chess extends BoardGame{
  Chess() {
    super(11);
    System.out.println("Chess constructor");
  }

  public static void main(String[] args) {
    Chess x = new Chess();
  }
}
