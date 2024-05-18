package InnerClass.SingletoneClass;

class Singleton {

    private static Singleton singleton = new Singleton( ); // = null;

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton() { }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        /*
         if(instance == null) {
            instance = new ClassicSingleton();
          }
          return instance;
        */
        return singleton;
    }

    /* Other methods protected by singleton-ness */
    protected void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
public class Tester {

    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );
    }
}