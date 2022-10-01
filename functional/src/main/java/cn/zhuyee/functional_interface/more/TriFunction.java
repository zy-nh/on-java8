package cn.zhuyee.functional_interface.more;

/**
 * <h2>自定义函数式接口</h2>
 * 含多个参数的函数式接口
 *
 * Created by zhuye on 2022/9/28 23:07.
 */
@FunctionalInterface
public interface TriFunction<T,U,V, R> {
  R apply(T t, U u, V v);
}
