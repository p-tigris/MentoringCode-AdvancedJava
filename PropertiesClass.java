package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesClass {

    public Properties getProperties() {//Method for getting properties of a .properties file - return type Properties
        Properties properties = new Properties();//Creates an object of the Properies class

        InputStream inputStream = null; //Initializes an InputStream object as null
        try {// Handles exceptions found during FileInputStream execution
            inputStream = new FileInputStream("src/examples/employee.properties");//Creates a connection to a
                                                                                        //.properties file
            properties.load(inputStream); //Reads a Properties list from the InputStream
        } catch (FileNotFoundException e) { //Handles exception if file doesn't exist
            e.printStackTrace();

        } catch (IOException e) {//Handles exception with input/output issues
            e.printStackTrace();
        }
        return properties;//returns list of Properties
    }

    public static void main(String[] args) {
        PropertiesClass propertiesClass = new PropertiesClass();
        Properties prop1 = propertiesClass.getProperties();
        System.out.println(prop1.getProperty("YearsWorked"));

    }
}
