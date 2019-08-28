package examples;

public class ThrowException {
    public static void main(String[] args) {

        String name = "Shoumik";
        if (name.equals("Shoumik")) {
            System.out.println("Access Granted");
        } else {
            throw new SecurityException("Unauthorized User - Access Denied");
        }
    }
}
