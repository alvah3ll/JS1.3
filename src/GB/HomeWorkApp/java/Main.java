package GB.HomeWorkApp.java;

public class Main {

    public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        static void checkSumSign () {
            int a = 10;
            int b = 12;
            int x = (a + b);
            if (x >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная”");
            }
        }
        static void printColor () {
            int value = 67;
            if (value < 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }

        }
        static void compareNumbers () {
            int a = 65;
            int b = 34;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }


