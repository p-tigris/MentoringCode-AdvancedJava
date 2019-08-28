package examples;

public class SingletonTest {

    public static void main(String[] args) {
     SingletonClass singletonClass = SingletonClass.getInstance();
     SingletonClass singletonClass2 = SingletonClass.getInstance();

     singletonClass.singleString = singletonClass.singleString.toUpperCase();
        System.out.println(singletonClass2.singleString);
    }
}
