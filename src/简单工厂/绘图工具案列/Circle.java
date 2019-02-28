package 简单工厂.绘图工具案列;

/**
 * Copyright @ Biliu工作室
 * 圆形具体产品类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:20
 */
public class Circle implements Shape{

    public Circle(){
        System.out.println("调用圆形工具");
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形工具");
    }

    @Override
    public void erase() {
        System.out.println("搽除圆形");
    }
}
