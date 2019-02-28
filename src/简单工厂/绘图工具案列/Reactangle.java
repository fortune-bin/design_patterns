package 简单工厂.绘图工具案列;

/**
 * Copyright @ Biliu实验室
 * 炬形具体产品类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:23
 */
public class Reactangle implements Shape {
    public Reactangle(){
        System.out.println("调用矩形工具");
    }
    @Override
    public void draw() {
        System.out.println("开始绘制矩形");

    }

    @Override
    public void erase() {
        System.out.println("搽除矩形");

    }
}
