package HomeWorkApp6;

public class Dog extends Animal {

    public static final int maxRun = 400;
    public static final int maxSwim = 2;


    public Dog(int run,int swim) {
        super(run,swim);
    }


public Dog(){
        this(maxRun,maxSwim);
}


@Override
    public boolean run(int distance) {
        if (this.run >= distance) {
            System.out.println("The dog max ran: "+run);
            System.out.println(" The dog ran:"+ distance);
            return true;
        }else{
            System.out.println("The dog did't  max run:"+ run);
            System.out.println("The dog did't run:" + distance);
            return false;
    }
    }


@Override
    public boolean swim (int distance) {
        if (this.swim >= distance) {
            System.out.println("The dog max swam: " + swim);
            System.out.println("The dog wam: " + distance);
            return true;
        }else {
        System.out.println("The dog did't  max swim:"+ swim);
        System.out.println("The dog did't swim:"+ distance);
        return false;
    }
}


    @Override
    public String toString() {
        return "Dog{" +
                "run=" + run +
                ", swim=" + swim +
                '}';
    }
}

