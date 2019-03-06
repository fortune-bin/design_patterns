package 适配器模式;

/**
 * Copyright @ 吉诺网络科技
 * 汽车控制类
 * @author Suaron
 * @Description TODO
 * @date 2019-03-06 18:05
 */
public abstract class CarController {
    public void move(){
        System.out.println("玩具车移动");
    }
    public abstract void phonate(); // 发出声音
    public abstract void twinkle(); // 灯光闪烁

}
