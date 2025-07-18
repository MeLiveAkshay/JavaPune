package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectDemo {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;

        try {
            // Create a product object
            Product product = new Product(101, "Wireless Mouse", 499.0, "Electronics");

            // Connect file stream to output file
            fileOutputStream = new FileOutputStream("D:\\Java IDE\\JavaTrainingPune\\src\\File\\product.txt");
            outputStream = new ObjectOutputStream(fileOutputStream);

            // Write object to file
            outputStream.writeObject(product);

            System.out.println("Product object written to file successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) outputStream.close();
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
