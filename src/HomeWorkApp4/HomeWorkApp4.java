package HomeWorkApp4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static char[][] map;
    public static final int SIZE = 3;

    public static char DOT_EMPTY = '•';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
        if (chekWin0(DOT_X)) {
            System.out.println(" Человек победил!");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
        computerTurn();
        printMap();
        if (chekWin0(DOT_O)) {
            System.out.println("Выиграл компьютер!");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
    }
    }
    private static boolean isMapFull(){
        for (int i=0;i<SIZE;i++){
            for(int j=0;j< SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }


    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1)+ " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map [i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do{
             System.out.println("Введите координаты в форме X Y");
            x= scanner.nextInt() -1;
            y= scanner.nextInt()- 1;

            if(x<0 || x>=SIZE|| y<0 || y>= SIZE){
                System.out.println("Данные введены некорректно!");
            } else if (map [x][y] != DOT_EMPTY) {
                    System.out.println("Клетка уже занята!");
                } else{
                break;
                }

        } while (true);
        map[x][y]= DOT_X;
}
private static  void computerTurn(){
        int x;
        int y;
    Random random=new Random();
    do {
        x= random.nextInt(SIZE);
        y= random.nextInt(SIZE);
    }while (map[x][y] != DOT_EMPTY);

    map[x] [y]= DOT_O;

    }
    private  static  boolean chekWin0(char symb){
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;

        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;

        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

        return false;
    }
}
