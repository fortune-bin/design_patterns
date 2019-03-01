package 抽象工厂.皮肤案例;

/**
 * Copyright @ 吉诺网络科技
 * 春天按钮具体产品类
 * @author Suaron
 * @Description TODO
 * @date 2019-03-01 18:32
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("春天风格按钮");
    }
}
