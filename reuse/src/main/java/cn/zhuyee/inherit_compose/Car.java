package cn.zhuyee.inherit_compose;

import java.util.Calendar;

/**
 * <h2>组合一辆车</h2>
 *
 * <br>
 * Created by zhuye at 2022/10/27 9:03.
 */
// 引擎
class Engine{
  public void start(){}
  public void rev(){}
  public void stop(){}
}
// 轮胎
class Wheel{
  public void inflate(int psi){}
}
// 窗户
class Window{
  public void rollup(){}
  public void rolldown(){}
}
// 门
class Door{
  public Window window = new Window();
  public void open(){}
  public void close(){}
}
// 车
public class Car {
  public Engine engine = new Engine();
  public Wheel[] wheels = new Wheel[4];
  public Door left = new Door(),
              right = new Door();
  public Car(){
    for (int i = 0; i < 4; i++) {
      wheels[i] = new Wheel();
    }
  }

  public static void main(String[] args) {
    Car car = new Car();
    car.left.window.rollup();
    car.wheels[0].inflate(72);
  }
}
