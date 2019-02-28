package 工厂方法模式.日志记录案例;

/**
 * Copyright @ Biliu工作室
 * 数据库记录类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:10
 */
public class DataLogger implements Logger {

    @Override
    public void outputLog() {
        System.out.println("数据库输出日志");
    }

}
