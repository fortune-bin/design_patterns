package 适配器模式;

/**
 * Copyright @ 吉诺网络科技
 * 适配器测试类
 * @author Suaron
 * @Description TODO
 * @date 2019-03-06 18:21
 */
public class Client {
    public static void main(String[] args) {
        CarController cc = new PoliceCarAdapter();
        cc.move();
        cc.phonate();
        cc.twinkle();
    }
}
