package 工厂方法模式.日志记录案例;

/**
 * Copyright @ Biliu工作室
 * 日志工厂类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:13
 */
public interface LoggerFactory {
    /**
     * 创建具体日志工厂
     * @return
     */
    public Logger createLogger();
}
