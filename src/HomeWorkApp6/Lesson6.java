package HomeWorkApp6;

import java.util.Random;

public class Lesson6 {
    public static void main(String[] args) {
        Animal[] competition = prepareCompetition();
        playGame(competition);
    }

    public static Animal[] prepareCompetition() {
        return new Animal[]{
                new Dog(),
                new Cat(),
                new Dog(200, 1),
                new Cat(50, 0),
        };
    }

    public static void playGame(Animal[] competitions) {
        Random random = new Random();

        for (Animal competition : competitions) {
            competition.printInfo();
            System.out.println(competition.run(random.nextInt(100)));
            System.out.println(competition.swim(random.nextInt(10)));
            System.out.println();
        }
    }
}
