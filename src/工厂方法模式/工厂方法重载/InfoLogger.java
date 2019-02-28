package 工厂方法模式.工厂方法重载;

/**
 * Copyright @ Biliu工作室
 * 运行日志实体类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:50
 */
public class InfoLogger implements Logger {
    @Override
    public void outputLog() {
        System.out.println("运行日志输出");
    }
}
