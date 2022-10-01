package main.java.cn.zhuyee.functional_interface;

import java.util.function.*;

/**
 * <h2>可用于 lambda 表达式的所有不同的 Function 变种</h2>
 * <p>
 * <p>
 * Created by zhuye on 2022/9/28 21:59.
 */
public class LambdaFunctionVariants {
  static Function<Foo, Bar> function = foo -> new Bar(foo);
  static IntFunction<IBaz> intFunction = i -> new IBaz(i);
  static LongFunction<LBaz> longFunction = l -> new LBaz(l);
  static DoubleFunction<DBaz> doubleFunction = d -> new DBaz(d);

  static ToIntFunction<IBaz> toIntFunction = ib -> ib.i;
  static ToLongFunction<LBaz> toLongFunction = lb -> lb.l;
  static ToDoubleFunction<DBaz> toDoubleFunction = db -> db.d;

  static IntToLongFunction intToLongFunction = i -> i;
  static IntToDoubleFunction intToDoubleFunction = i -> i;
  static LongToIntFunction longToIntFunction = l -> (int) l;
  static LongToDoubleFunction longToDoubleFunction = l -> l;
  static DoubleToIntFunction doubleToIntFunction = d -> (int) d;
  static DoubleToLongFunction doubleToLongFunction = d -> (long) d;

  public static void main(String[] args) {
    Bar bar = function.apply(new Foo());
    IBaz iBaz = intFunction.apply(11);
    LBaz lBaz = longFunction.apply(11);
    DBaz dBaz = doubleFunction.apply(11);

    int i = toIntFunction.applyAsInt(iBaz);
    Long l = toLongFunction.applyAsLong(lBaz);
    Double d = toDoubleFunction.applyAsDouble(dBaz);

    l = intToLongFunction.applyAsLong(12);
    d = intToDoubleFunction.applyAsDouble(12);
    i = longToIntFunction.applyAsInt(12);
    d = longToDoubleFunction.applyAsDouble(12);
    i = doubleToIntFunction.applyAsInt(13.0);
    l = doubleToLongFunction.applyAsLong(13.0);

  }
}

class Foo {
}

class Bar {
  Foo f;

  Bar(Foo f) {
    this.f = f;
  }
}

class IBaz {
  int i;

  IBaz(int i) {
    this.i = i;
  }
}

class LBaz {
  Long l;

  public LBaz(Long l) {
    this.l = l;
  }
}

class DBaz {
  double d;

  public DBaz(double d) {
    this.d = d;
  }
}