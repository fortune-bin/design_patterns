package 单例模式;

/**
 * 简单单例 - 懒汉模式
 * 单例意思是保持一个类从始至终只有一个实例
 */
public class SingletonLh {
    private static SingletonLh instance = null;

    private SingletonLh() {
    }

    /**
     * 获取实例
     * @return
     */
    public static SingletonLh getInstance(){
        if(instance == null){
            instance = new SingletonLh();
        }
        return instance;
    }
}
