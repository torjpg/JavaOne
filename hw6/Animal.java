package hw6;

public class Animal {
    private int maxRun;
    private int maxSwim;
    private String name;

    public Animal(int maxRun, int maxSwim, String name){
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
        this.name = name;
    }
    public void toRun(double dist){
        if (maxRun >= dist){
            System.out.println(name + " пробежал/а " + dist);
        }
        else System.out.println(name + " не может пробежать дистанцию");
    }
    public void toSwim(double dist){
        if (maxSwim >= dist){
            System.out.println(name + " проплыл/а " + dist);
        }
        else System.out.println(name + " не может проплыть дистанцию");
    }
}
