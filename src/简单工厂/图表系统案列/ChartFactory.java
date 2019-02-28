package 简单工厂.图表系统案列;

/**
 * Copyright @ Biliu工作室
 * 图表工厂类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 23:00
 */
public class ChartFactory {

    public static Chart getChart(String type){
        Chart chart = null;
        /**
         * equalsIgnoreCase 与 equals 比较  前者是忽略大小写的
         */
        if(type.equals("柱状图")){
            chart = new HistogramChart();
        }
        if(type.equalsIgnoreCase("饼图")){
            chart = new PieChart();
        }
        if(type.equals("折线图")){
            chart = new LineChart();
        }
        return chart;
    }
}
