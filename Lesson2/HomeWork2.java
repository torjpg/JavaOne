package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до
        // 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println(checkNumber(10, -100));
        //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        checkPositive(100);
        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.
        System.out.println(checkNegative(0));
        //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
        // указанную строку, указанное количество раз;
        printText("Soloma", 5);
        //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
        // не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.
        System.out.println(checkWhatYear(1996));
    }
    //1
    public static boolean checkNumber (int a, int b) {
        if (a+b >= 10 && a+b <= 20) return true;
        return false;
    }
    //2
    public static void checkPositive (int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    //3
    public static boolean checkNegative (int z) {
        if (z < 0) return true;
        return false;
    }
    //4
    public static void printText (String a, int g) {
        for (int i = 0; i < g; i++){
            System.out.println(a);
        }
    }
    public static boolean checkWhatYear (int a) {
        if (a % 400 == 0) return true;
        if (a % 4 == 0 && a % 100 != 0) return true;
        return false;
    }
}
