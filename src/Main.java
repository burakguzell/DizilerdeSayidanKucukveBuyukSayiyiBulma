import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number;
        Scanner input = new Scanner(System.in);

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Girilen Sayı : ");
        number = input.nextInt();

        int min = list[0];
        int max = list[0];

        for(int i : list){
            if(i <= number){
                min = i;
            }
            if (i >= number){
                max = i;
                break;
            }
        }

        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı : " + min);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı : " + max);
    }
}
