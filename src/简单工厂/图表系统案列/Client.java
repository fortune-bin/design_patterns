package 简单工厂.图表系统案列;

/**
 * Copyright @ Biliu工作室
 * 客户端测试类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:08
 */
public class Client {

    public static void main(String args[]){
        Chart chart = ChartFactory.getChart("柱状图");
        chart.display();
    }
}
