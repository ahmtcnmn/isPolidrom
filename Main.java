import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    static boolean isPalidrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a;
        boolean b;
        out.print("Bulmak istediğiniz polidrom sayıyı giriniz : ");
        a=input.nextInt();
        b=isPalidrom(a);
        if (b==true) out.println("Sayınız Polidrom sayıdır: "+a);
        else out.print("Sayınız Polidrom değildir: "+a);

    }
}
