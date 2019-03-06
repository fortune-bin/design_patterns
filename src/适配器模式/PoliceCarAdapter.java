package 适配器模式;

/**
 * Copyright @ 吉诺网络科技
 * 警车适配器
 * @author Suaron
 * @Description TODO
 * @date 2019-03-06 18:13
 */
public class PoliceCarAdapter extends CarController {
    private PoliceSound sound;
    private PoliceLamp  lamp;

    /**
     * 测试数据
     */
    public PoliceCarAdapter() {
        this.sound = new PoliceSound();
        this.lamp = new PoliceLamp();
    }

    /**
     * 警笛声音
     */
    @Override
    public void phonate() {
        sound.alarmSound();
    }

    /**
     * 警灯闪烁
     */
    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
