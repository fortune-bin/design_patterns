package 工厂方法模式.案列加强反射与配置文件;

/**
 * Copyright @ 吉诺网络科技
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
