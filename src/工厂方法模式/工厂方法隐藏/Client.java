package 工厂方法模式.工厂方法隐藏;

/**
 * Copyright @ Biliu工作室
 * 客户端测试类d
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:19
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory ;
        Logger logger;
        factory = new FileLoggerFactory();
        factory.writeLog();

    }
}
