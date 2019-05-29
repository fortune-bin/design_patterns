package 单例模式;

/**
 * 懒汉单例类-存在线程安全的问题
 * ：假设多个线程同时调用 getInstance（）方法不就产生了不一样的对象地址了吗
 */
public class Singleton {

    public static Singleton instance = null;

    private Singleton() {
    }

    /**
     * 如果将 synchronized 作用于getInstance 方法上我们每次都要去判断是否锁定影响效率 这边我们采用 作用于实现代码那边
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * 对上面的getInstance 进行进一步的优化改进  采用双重锁机制
     * 上面 对上面的getInstance 还是会存在对象不唯一的情况
     * 两个线程我都同时 getInstance 线程A 进入了 创建 new Singleton() 动作 这时候 线程B在等待线程A 但是线程A完成了线程B并不知道你已经创建了这个时候就会倒是创建多个对象地址
     *
     * @return
     */
    public static Singleton hqInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }
  }
