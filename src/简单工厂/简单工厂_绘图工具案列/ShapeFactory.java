package 简单工厂.简单工厂_绘图工具案列;

import sun.tools.tree.UnsignedShiftRightExpression;

/**
 * Copyright @ Biliu工作室
 * 绘图工厂类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:29
 */
public class ShapeFactory {
    private final static String TRIANGLE= "TRIANGLE";
    private final static String ROUND= "ROUND";
    private final static String RECTANGLE= "RECTANGLE";

    public static Shape handle(String type) throws InstantiationException {
        Boolean codeSwitch = Boolean.TRUE;
        Shape shape = null;
        if(type.equals(TRIANGLE)){
            shape = new Triangle();
            codeSwitch = Boolean.FALSE;
        }
        if(type.equals(ROUND)){
            shape = new Circle();
            codeSwitch = Boolean.FALSE;
        }
        if(type.equals(RECTANGLE)){
            shape = new Reactangle();
            codeSwitch = Boolean.FALSE;
        }
        if(codeSwitch){
            throw new InstantiationException("没有相关的绘制工具");
        }

        return shape;
    }
}
