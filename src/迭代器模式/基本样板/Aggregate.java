package 迭代器模式.基本样板;

/**
 * Copyright @ 吉诺网络科技
 * 抽象聚合类
 * @author Suaron
 * @Description TODO
 * @date 2019-05-06 23:05
 */
public interface Aggregate {

    /**
     * 创建一个迭代器对象
     * @return
     */
    Iterator createIterator();
}
