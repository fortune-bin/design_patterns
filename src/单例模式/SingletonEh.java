package 单例模式;

/**
 * 单例模式-饿汉
 */
public class SingletonEh {
        private static SingletonEh instance = new SingletonEh();

    private SingletonEh() {
    }
    public static SingletonEh getInstance(){
        return instance;
    }
}
