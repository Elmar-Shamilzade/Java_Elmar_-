package Homwerk;

public class MathCalculationsElmar {
    public static void main(String[] args) {
        double number1 = 25.0;
        double number2 = -4.7;
        double number3 = 2.5;

        // Вычисление квадратного корня
        System.out.println("Корень из 25: " + (int)Math.sqrt(number1));

        // Модуль числа
        double absoluteValue = number2;
        if(number2 < 0) absoluteValue = -number2;
        System.out.println("Модуль -4.7: " + absoluteValue);

        // Возведение в степень
        double cubed = number3;
        cubed = cubed * number3 * number3;
        System.out.println("2.5 в кубе: " + cubed);

        // Поиск минимума и максимума
        double smaller = number1;
        if(number3 < number1) smaller = number3;
        double bigger = number3;
        if(number1 > number3) bigger = number1;
        System.out.println("Меньшее: " + smaller);
        System.out.println("Большее: " + bigger);

        // Округление
        System.out.println("Округление вниз: " + (int)number2);
        System.out.println("Округление вверх: " + (int)(number2 + 0.9999));
        System.out.println("Математическое округление: " + (int)(number2 + 0.5));

        // Случайное число
        double randomValue = Math.random();
        System.out.println("Случайное: " + randomValue);

        // Лишняя проверка
        if((int)Math.sqrt(number1) != 5) {
            System.out.println("Что-то не так с корнем");
        }
    }
}