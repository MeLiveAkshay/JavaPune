package array;  // Declares that this class is part of the 'array' package

public class ProductArray {  // Main class
    public static void main(String[] args) {  // Main method: program execution starts here

        // Create an array of Product objects with size 5
        Product[] products = new Product[5];

        // Initialize each element in the array using the Product constructor
        products[0] = new Product(101, "Mobile", 15000.00f, "Electronic");        // First product
        products[1] = new Product(102, "Laptop", 55000.00f, "Electronic");        // Second product
        products[2] = new Product(103, "Washing Machine", 25000.00f, "Home Appliance");  // Third product
        products[3] = new Product(104, "Desk", 5000.00f, "Furniture");            // Fourth product
        products[4] = new Product(105, "Shoes", 2000.00f, "Fashion");             // Fifth product

        // Print a title for product list
        System.out.println("Product List:");

        // Use enhanced for loop to iterate through each product and print its details
        for (Product p : products) {
            // Separator for clarity
            System.out.println("---------------------------");

            // Access and print each field using getter methods
            System.out.println("ID: " + p.getProductId());        // Print product ID
            System.out.println("Name: " + p.getProductName());    // Print product name
            System.out.println("Price: " + p.getPrice());         // Print product price
            System.out.println("Category: " + p.getCategory());   // Print product category
        }
    }
}
