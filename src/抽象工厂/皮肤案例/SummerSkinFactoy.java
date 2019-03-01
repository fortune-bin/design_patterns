package 抽象工厂.皮肤案例;

/**
 * Copyright @ 吉诺网络科技
 * 夏天皮肤工厂
 * @author Suaron
 * @Description TODO
 * @date 2019-03-01 18:40
 */
public class SummerSkinFactoy implements SkinFactoy {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SummerTextFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

}
