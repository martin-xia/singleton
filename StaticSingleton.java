/*
 * Singleton implemented with static and final
 * Martin.Xia
 */
public class StaticSingleton{
    private static final StaticSingleton INSTANCE = new StaticSingleton();
  
    //to prevent creating another instance of Singleton
    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return INSTANCE;
    }
}

