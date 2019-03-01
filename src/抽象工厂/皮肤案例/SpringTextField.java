package 抽象工厂.皮肤案例;

/**
 * Copyright @ 吉诺网络科技
 * 春天风格文本框
 * @author Suaron
 * @Description TODO
 * @date 2019-03-01 18:35
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("春天风格文本框");
    }
}
