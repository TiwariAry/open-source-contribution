import java.util.Scanner;
import java.util.Arrays;

public class Seive_of_Sundaram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean[] array = new boolean[n / 2];
        Arrays.fill(array, true);

        int index = 0;
        int increment = 3;
        int incre_increment = 7;

        System.out.println("The list of prime numbers is,");
        System.out.print("\n2 ");

        for (int i = 3; i <= n; i += 2){
            if (array[index]){
                int temp_index = index + increment;
                for (int j = i * i; j <= n; j += i){
                    if (j % 2 == 0){
                        continue;
                    }
                    array[temp_index] = false;
                    temp_index += i;
                }

                System.out.print(i + " ");
            }

            increment += incre_increment;
            incre_increment += 4;
            index ++;
        }
    }
}
