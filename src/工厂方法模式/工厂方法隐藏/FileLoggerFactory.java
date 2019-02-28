package 工厂方法模式.工厂方法隐藏;

/**
 * Copyright @ Biliu工作室
 * 文件工厂具体日志类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:17
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
