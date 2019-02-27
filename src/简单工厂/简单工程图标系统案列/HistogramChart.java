package 简单工厂.简单工程图标系统案列;

/**
 * Copyright @ Biliu工作室
 * 柱状图表
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 22:53
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
