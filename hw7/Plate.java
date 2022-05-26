package hw7;

public class Plate {
    private int amountOfFood;

    public Plate(int amountOfFood){
        this.amountOfFood = amountOfFood;
    }
    public void info() {
        System.out.println("plate: " + amountOfFood);
    }
    public int getAmountOfFood(){
        return amountOfFood;
    }
    public void setAmountOfFood(int amountOfFood){
        this.amountOfFood = amountOfFood;
    }
    public void putFood(int food){
        amountOfFood = food + amountOfFood;
    }
}
