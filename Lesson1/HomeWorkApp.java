package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        //2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange,
        // Banana, Apple.
        printThreeWords();
        //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
        // их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
        // больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
        // в противном случае - “Сумма отрицательная”;
        checkSumSign();
        //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым
        // значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
        // если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
        // если больше 100 (100 исключительно) - “Зеленый”;
        printColor();
        //5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
        // любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль
        // сообщение “a >= b”, в противном случае “a < b”;
        compareNumber();

    }
    //2
    public static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }
    //3
    public static void checkSumSign() {
        int a = 10;
        int b = 1000-50;
        if (a + b >= 0) System.out.println("Сумма положителная");
        else System.out.println("Сумма отрицательная");
    }
    //4
    public static void printColor(){
        int value = 101;
        if (value <= 0) System.out.println("Red");
        else if (value > 0 && value <= 100) System.out.println("Yellow");
        else System.out.println("Green");

    }
    //5
    public static void compareNumber(){
        int a = 5;
        int b = 10 - a;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}