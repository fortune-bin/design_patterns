package 简单工厂.简单工程图标系统案列;

/**
 * Copyright @ Biliu工作室
 * 饼形图表
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 22:55
 */
public class PieChart implements Chart {

    public PieChart(){
        System.out.print("创建饼形图表");
    }

    @Override
    public void display() {
        System.out.println("显示饼形图");
    }
}
