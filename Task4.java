/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        str = scan.nextLine();
        scan.close();
        if (str.isEmpty()){
            throw new Exception("Пустые строки вводить нельзя");
        }
        System.out.println(str);
    }
}
