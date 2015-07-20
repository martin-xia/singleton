/*
 * Singleton implemented with volatile and double-checked locking
 * Martin.Xia
 */
 public class ClassicSingleton {
   private static volatile ClassicSingleton instance = null;
   protected ClassicSingleton() {
      // Exists only to defeat instantiation.
   }
   public static ClassicSingleton getInstance() {
     if(singleton == null) {
        synchronized(ClassicSingleton.class) {
          if(singleton == null) {
            singleton = new ClassicSingleton();
          }
        }
     }
     return singleton;
   }
}

