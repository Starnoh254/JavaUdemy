package Lessons2;

import java.io.FileWriter;
import java.io.IOException;

public class LessonQ {
    public static void main(String[] args){

        // IOException is a checked exception i.e the compiler forces us to handle the exception
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\user\\Desktop\\test.txt");
            myWriter.write("Hi ,I'm trying to write something again ");
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();

        }

    }
}