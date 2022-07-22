package KosulluIfadeBloklari;
import java.util.Scanner;
public class RecommendActivity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığı nedir? ");
        System.out.println("A) 5 dereceden küçük");
        System.out.println("B) 5 ile 15 derece arasında");
        System.out.println("C) 15 ile 25 derece arasında");
        System.out.println("D) 25 dereceden büyük");
        System.out.println("Seçiminiz(a,b,c,d): ");

        String whether = input.nextLine();
        switch (whether){
            case "a":
                System.out.print("Bence kayak yapmaya gidin.");
                break;

            case "b":
                System.out.print("Bence sinemaya gidin.");
                break;

            case "c":
                System.out.print("Tam piknik havası.");
                break;

            case "d":
                System.out.print("Denizin sıcaklığı on numaradır.");
                break;

            default:
                System.out.print("Uyuyun bence siz en iyisi. Sonra düşünürsünüz.");
        }

    }

}
