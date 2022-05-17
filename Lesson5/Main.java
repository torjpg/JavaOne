package hw5;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Main {
    public static void main(String[] args) {
        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Vladislav", "engeneer", "makfk@mail.ru", "11111", 81, 4500000);
        persArray[1] = new Personal("Margarita", "developer", "lkaorf75@mail.ru", "22222", 52, 100000000);
        persArray[2] = new Personal("Alehandro", "cleaner", "clehapf0@mail.ru", "33333", 16, 45000);
        persArray[3] = new Personal("Julia", "manager", "managerthebest@mail.ru", "44444", 34, 700000);
        persArray[4] = new Personal("Angelika", "designer", "dezkz@mail.ru", "55555", 35, 5000000);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40)
                persArray[i].informationAboutPersonal();
        }
    }
}
