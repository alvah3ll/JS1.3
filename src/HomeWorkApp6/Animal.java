package HomeWorkApp6;

public  abstract class Animal {

    protected int run;
    protected int swim;


    public Animal(int run,int swim) {
        this.run= run;
        this.swim= swim;
        }
        public void printInfo(){
        System.out.println(this);

    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);


    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "run=" + run +
                ", swim=" + swim +
                '}';

}
}


