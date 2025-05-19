/**
 * 饿汉式
 */
public class singleton {
    private static singleton insteance = new singleton();
    private singleton(){
    }
    public static singleton getInstance(){
        return insteance;
    }
}

/**
 * 懒汉式
 */
class instance{
    private static instance instance ;
    private instance(){
    }
    public static instance getInstance(){
        //双检加锁
        if (instance==null){
            synchronized (instance.class){
                if (instance==null){
                    instance = new instance();
                }
            }

        }
        return instance;
    }
}

class demo{
    public static void main(String[] args) {
        singleton instance1 = singleton.getInstance();
        singleton instance2 = singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1 = "+ instance1);
        System.out.println("instance2 = " + instance2);
        System.out.println("===========");
        instance instance3 = instance.getInstance();
        instance instance4 = instance.getInstance();
        System.out.println(instance3==instance4);
        System.out.println(instance3);
        System.out.println(instance4);
    }
}

