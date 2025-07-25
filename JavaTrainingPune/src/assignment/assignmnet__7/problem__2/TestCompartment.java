package assignment.assignmnet__7.problem__2;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int type = random.nextInt(4) + 1; // 1 to 4
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Polymorphic behavior
        System.out.println("Compartment Notices:");
        for (int i = 0; i < compartments.length; i++) {
            System.out.print("Compartment " + (i + 1) + ": ");
            compartments[i].notice();
        }
    }
}
