package HomeWorkApp2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        task1(a, b);
        int x = 2;
        task2(x);
        int i = -8;
        task3(i);
        int c = 0;
        task4(c);

    }

    static boolean task1(int a, int b) {
        int y = (a + b);
            if (y >= 10 && y <= 20) {
                return true;
            } else {
                return false;
            }
        }
    static void task2(int x){
        if(x>=0){
            System.out.println("Число"+x+"положительное");
        }else {
            System.out.println("Число"+x+"отрицательное");
        }
    }
    static boolean task3(int i){
        if(i>=0){
            return true;
        }else {
            return false;
        }

    }
    static void task4(int c){
        for (c=0;c<5;c++){
            System.out.println("PuppyCat");
        }
    }
}
