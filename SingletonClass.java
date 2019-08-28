package examples;

public class SingletonClass {

    String singleString;

    private static SingletonClass singletonClass = null;

    private SingletonClass() {
        singleString = "This is a singleton class";
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }
}
