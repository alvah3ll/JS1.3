package HomeWorkApp7;

public class CatsAndPlate {
    public static void main(String[] args) {
        CatPlateTask5();
    }
    static void CatPlateTask5(){
        Cat[] catArr= new Cat[3];
        catArr[0]= new Cat ("Nino",20);
        catArr[1]= new Cat("Joy",80);
        catArr[2]= new Cat("Lyly",140);
        for (int i=0;i<=catArr.length;i++){
            if(catArr[i].getAppetite()<= 200){
                System.out.println("Name:"+" "+catArr[i].getName());
                System.out.println("Appetite:"+" "+catArr[i].getAppetite());
                System.out.println("Leftovers:"+" "+( 200 - catArr[i].getAppetite()));
                System.out.println("Full!");
                System.out.println();
            }
        }

    }
}
