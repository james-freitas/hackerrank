package contratado.me.staircase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        //System.out.printf("%2s")

        StairCase(height);
    }


    static void StairCase(int n) {

        for (int i = 0; i < n; i++) {
            if (n -i -1 > 0) {

                System.out.printf("%" + ( n - i -1 ) + "s", "");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
