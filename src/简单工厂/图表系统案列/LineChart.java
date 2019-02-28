package 简单工厂.图表系统案列;

/**
 * Copyright @ Biliu工作室
 * 折线图=具体产品类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-27 22:58
 */
public class LineChart implements Chart{
    public LineChart(){
        System.out.println("折线图创建");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
