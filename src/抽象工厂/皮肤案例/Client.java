package 抽象工厂.皮肤案例;

/**
 * Copyright @ 吉诺网络科技
 * 抽象工厂客户端测试类
 * @author Suaron
 * @Description TODO
 * @date 2019-03-01 18:52
 */
public class Client {

    public static void main(String []args){
        SkinFactoy bean = (SkinFactoy) XMLUtils.getBean();
        Button button = bean.createButton();
        ComboBox comboBox = bean.createComboBox();
        TextField textFiled = bean.createTextFiled();
        button.display();
        comboBox.display();
        textFiled.display();
    }
}
