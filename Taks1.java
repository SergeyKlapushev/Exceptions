/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taks1 {

    public static void main(String[] args) {
        float value = insertFloatValue();
        System.out.println("Спасибо за " + value);
    }

    public static float insertFloatValue() {
        System.out.println("Введите дробное число типа float: ");
        Scanner scan = new Scanner(System.in);
        float value;
        try {
            value = scan.nextFloat();
            scan.close();
            return value;
        } catch (InputMismatchException imp) {
            System.out.println(erroreMessager());
            value = insertFloatValue();
        }
        return value;
    }

    private static String erroreMessager() {
        return "Не верный формат числа.";
    }
}
