package HomeWorkApp7;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

        Cat cat = new Cat("Mac", 30);
        Cat cat1= new Cat("Coco",110);
        Cat cat2= new Cat("Joy",60);


        Plate plate = new Plate(90);
        Plate plate1= new Plate(120);
        Plate plate2= new Plate(50);

      System.out.println("Cat Mac:");
      plate.info();
      cat.Eat(plate);

      System.out.println();

      System.out.println("Cat Coco:");
        plate.info();
        cat1.Eat(plate1);


        System.out.println();

        System.out.println("Cat Joy:");
        plate.info();
        cat2.Eat(plate2);

    }

}

