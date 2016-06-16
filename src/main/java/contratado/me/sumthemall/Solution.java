package contratado.me.sumthemall;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();

        int[] numberList = new int[nums];

        for (int i = 0; i < nums; i++) {
            numberList[i] = scanner.nextInt();
        }

        System.out.println(sum(numberList));
    }


    static int sum(int[] numbers) {

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

}
