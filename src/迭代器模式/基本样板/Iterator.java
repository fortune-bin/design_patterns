package 迭代器模式.基本样板;

/**
 * Copyright @ 吉诺网络科技
 * 抽象迭代器
 * @author Suaron
 * @Description TODO
 * @date 2019-05-06 22:58
 */
public interface Iterator {
    /**
     * 获取第一个元素
     */
    public void first();

    /**
     * 获取下一个元素
     */
    public void next();

    /**
     * 是否存在下一个元素
     */
    public void hasNext();

    /**
     * 获取当前元素
     * @return
     */
    public Object currentItm();
}
