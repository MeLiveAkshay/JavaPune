package java7features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptionInCatch {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("D:\\Java IDE\\JavaTrainingPune\\src\\java7features\\message1.txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
                String str;
                while ((str = bufferedReader.readLine()) != null) {
                    System.out.println(str);
                }
            }

            int num1 = 10, num2 = 0;
            System.out.println("Division result: " + (num1 / num2));
        } 
        catch (FileNotFoundException | ArithmeticException exception) {
            System.out.println("Inside the catch block");
            exception.printStackTrace();
        }
        catch(IOException exception) {
        		exception.printStackTrace();
        }

        System.out.println("End of the application !!! ");
    }
}
