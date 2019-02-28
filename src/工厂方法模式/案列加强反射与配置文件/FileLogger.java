package 工厂方法模式.案列加强反射与配置文件;

/**
 * Copyright @ Biliu工作室
 * 文件日志类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:12
 */
public class FileLogger implements Logger {
    @Override
    public void outputLog() {
        System.out.println("文件日志输出");
    }
}
