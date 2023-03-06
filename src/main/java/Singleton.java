public class Singleton {
    private static Singleton sing;

    private Singleton() {
    }

   public static Singleton getSing() {
       if (sing == null) {
           sing = new Singleton();
       }

       return sing;
   }
}
