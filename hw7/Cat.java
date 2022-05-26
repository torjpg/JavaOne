package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void toEat(Plate ofFood){
        if (appetite <= ofFood.getAmountOfFood()){
            satiety = true;
            ofFood.setAmountOfFood(ofFood.getAmountOfFood() - appetite);
        }
    }
    public void full() {
        if (satiety == true) System.out.println(name + " сытый/ая");
        else System.out.println(name + " голодный/ая");
    }
}
