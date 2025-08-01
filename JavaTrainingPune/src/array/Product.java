package array;

/**
 * The Product class represents a product with ID, name, price, and category.
 */
public class Product {
    // Instance variables
    private int productId;          // Product ID
    private String productName;     // Name of the product
    private float price;            // Price of the product (changed from String to float)
    private String category;        // Category of the product (corrected spelling)

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public float getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(float price) {
        this.price = price;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Parameterized constructor to initialize all fields
    public Product(int productId, String productName, float price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // Default constructor
    public Product() {
        // No initialization done here
    }
    
}
