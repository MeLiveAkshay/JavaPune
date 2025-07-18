package input_output;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ID;
	private String name;
	private double price;
	private String category;

	public Product(int ID, String name, double price, String category) {
		this.ID = ID;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
}
