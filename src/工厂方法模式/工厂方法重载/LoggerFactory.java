package 工厂方法模式.工厂方法重载;

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

    /**
     * 打印日志的同时附加操作人id
     * @param operatorId
     * @return
     */
    public Logger createLogger(String operatorId);

    /**
     * 打印日志的同时附加操作人信息
     * @param operatingObject
     * @return
     */
    public Logger createLogger(Object operatingObject);

}
