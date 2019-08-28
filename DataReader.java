package examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataReader {

    public String readText() { // Method for reading a .txt file - contains no parameters
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filepath: ");
        String filePath = scanner.nextLine();
        String checkText; // Used for reading a file through BufferedReader
        String finalText = null; // Initialized as null because there is no text at the moment; will be used to return
                                 // text if text is found in the .txt file

        try {// Handles exceptions found while reading .txt file
            FileReader fileReader = new FileReader(filePath); //Class that reads file
            BufferedReader bufferedReader = new BufferedReader(fileReader);// Wrapper class that make file reading more
                                                                           // efficient
            while ((checkText = bufferedReader.readLine()) != null) { // Initializes variable that reads .txt file through
                                                                      // BufferedReader and checks to make sure it has text
                finalText = checkText; //Stores text in .txt file in a String variable declared earlier if not empty file
            }
            bufferedReader.close(); // Closes the BufferedReader
        } catch (FileNotFoundException e) { // Handles exception if the filepath inputted doesn't exist
            e.printStackTrace();
        } catch (IOException e) { //Handles exception dealing with input/output issues
            e.printStackTrace();
        }

        return finalText; // Returns text from .txt file in the form of a String
    }
}
