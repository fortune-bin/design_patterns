package 简单工厂.简单工厂_绘图工具案列;

/**
 * Copyright @ Biliu工作室
 * 客户端测试
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:39
 */
public class Client {
    private final static String TRIANGLE= "TRIANGLE";
    private final static String ROUND= "ROUND";
    private final static String RECTANGLE= "RECTANGLE";
    public static void main(String[] args) throws InstantiationException {
        Shape handle = ShapeFactory.handle(TRIANGLE);
        handle.draw();
        handle.erase();
    }
}
