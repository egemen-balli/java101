import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            number = scanner.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 != 1);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}