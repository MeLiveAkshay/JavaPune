package java5;

public enum Season {
    WINTER(10), SUMMER(20), SPRING(30), RAINY;

    int number;

    // Parameterized constructor
    private Season(int number) {
        this.number = number;
        System.out.println("Season Parameterized Constructor");
    }

    // Default constructor
    private Season() {
        System.out.println("Season Default Constructor");
    }

    // A private method
    @SuppressWarnings("unused")
	private void display() {
        System.out.println("Season: " + this.name() + ", Number: " + number);
    }
}
