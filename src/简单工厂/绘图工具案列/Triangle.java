package 简单工厂.绘图工具案列;

/**
 * Copyright @ Biliu工作室
 * 三角形具体产品类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:26
 */
public class Triangle implements Shape{
    public Triangle(){
        System.out.println("调用三角形工具");
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");

    }
    @Override
    public void erase() {
        System.out.println("搽除三角形");

    }
}
