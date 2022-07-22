package KosulluIfadeBloklari;
import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayı:");
        a = input.nextInt();
        System.out.println("2.Sayı: ");
        b = input.nextInt();
        System.out.println("3.Sayı: ");
        c = input.nextInt();

        int[] numbers = {a,b,c};
        for (int step = 0; step < numbers.length - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < numbers.length; i++) {

                if (numbers[i] < numbers[min_idx]) {
                    min_idx = i;
                }
            }

            int temp = numbers[step];
            numbers[step] = numbers[min_idx];
            numbers[min_idx] = temp;
        }
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}


