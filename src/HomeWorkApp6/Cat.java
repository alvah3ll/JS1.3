package HomeWorkApp6;

public class Cat extends Animal {

    public static final int maxRun = 150;
    public static final int maxSwim = 0;

    public Cat(int run,int swim) {
        super(run, swim);
    }

    public Cat() {
        this(maxRun,maxSwim);
    }


    @Override
    public boolean run(int distance) {
        if (this.run >= distance) {
            System.out.println("The cat max ran : " + run);
        System.out.println(" The cat ran:"+ distance);
            return true;
        } else {
            System.out.println("The cat did't  max run:" + run);
            System.out.println("The cat did't run:" + distance);
            return false;
        }
    }


    @Override
    public boolean swim(int distance) {
            System.out.println("Cats can't swim!");
            return false;
    }



        @Override
        public String toString () {
            return "Cat{" +
                    "run=" + run +
                    ", swim=" + swim +
                    '}';
        }
    }



