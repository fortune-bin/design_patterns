package 工厂方法模式.案列加强反射与配置文件;

/**
 * Copyright @ 吉诺网络科技
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
}
