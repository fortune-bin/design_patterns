package 抽象工厂.皮肤案例;

/**
 * Copyright @ 吉诺网络科技
 * 皮肤工厂抽象工厂
 * @author Suaron
 * @Description TODO
 * @date 2019-03-01 18:39
 */
public interface SkinFactoy {
    public Button createButton();
    public TextField createTextFiled();
    public ComboBox createComboBox();

}
