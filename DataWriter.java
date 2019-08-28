package examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataWriter {
    public void writeText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter some new text: ");
        String newText = scanner.nextLine();
        try { //Handles exceptions found in FileWriter class
            // BufferedWriter wraps around FileWriter to make writing more efficient. No need to create FileWriter object
            //FileWriter in this case takes two parameters: the filepath and a boolean for appending
            //If append is true, then new text is added to the file. If append is false, then new text replaces the old text
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write(newText);//Method defines what text should be added to the file
            bufferedWriter.close();//Closes the BufferedReader
        } catch (IOException e) { //Handles exceptions with input/output
            e.printStackTrace();
        }
    }
}
