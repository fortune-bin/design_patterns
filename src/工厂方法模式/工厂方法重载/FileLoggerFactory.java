package 工厂方法模式.工厂方法重载;

/**
 * Copyright @ Biliu工作室
 * 文件工厂具体日志类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:17
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String operatorId) {
        //多元化需求
        return null;
    }

    @Override
    public Logger createLogger(Object operatingObject) {
        //多元化需求
        return null;
    }
}
