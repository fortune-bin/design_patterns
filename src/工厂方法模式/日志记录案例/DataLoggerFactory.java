package 工厂方法模式.日志记录案例;

/**
 * Copyright @ Biliu工作室
 * 数据日志工厂具体类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:15
 */
public class DataLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        DataLogger dataLogger = new DataLogger();
        return dataLogger;
    }
}
