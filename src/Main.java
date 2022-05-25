import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, digitNumber = 0, tempNumber, digitValue, sum = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamakları toplanacak sayıyı giriniz: ");
        number = inp.nextInt();
        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }

        tempNumber = number;

        for (int k = 1; k <= digitNumber; k++) {
            digitValue = tempNumber % 10;
            sum += digitValue;
            tempNumber /= 10;
        }
        System.out.println("Girilen sayının basamakları toplamı: "+sum);
    }
}
