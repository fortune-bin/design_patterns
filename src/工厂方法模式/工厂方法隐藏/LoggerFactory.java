package 工厂方法模式.工厂方法隐藏;

/**
 * Copyright @ Biliu工作室
 * 日志工厂类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:13
 */
public abstract class LoggerFactory {

    public void writeLog(){
        Logger logger = this.createLogger();
         logger.outputLog();
    }
    /**
     * 创建具体日志工厂
     * @return
     */
    public abstract Logger createLogger();
}
