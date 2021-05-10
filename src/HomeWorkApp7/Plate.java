package HomeWorkApp7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (this.food >= amount) {
            food -= amount;
            System.out.println("Leftovers:" + " " + food);
            System.out.println("Full!");
            return true;
        } else {
            System.out.println("The plate is empty!");
            return false;
        }

    }

    public void info() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Add food to plate:");
        int Plate = scanner.nextInt();
        System.out.println("User added to plate:"+" "+ Plate);
            System.out.println("Plate:" + " " + food);
    }
}