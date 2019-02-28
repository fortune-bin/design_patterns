package 工厂方法模式.工厂方法重载;

/**
 * Copyright @ Biliu工作室
 *
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:51
 */
public class InfoLoggerFactor implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new InfoLogger();
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
