package contratado.me.realtest;

import java.util.*;

public class BlackJackReloaded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N;
        int M;
        int K;


        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        N = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        M = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        K = scanner.nextInt();

        int[] V= new int[N];

        if ( (N >= 1 && N <= 105) && (M >= 1 && M <= 1012)  && (K >= 1 && K <= 1012) ) {

            for (int i = 0; i < N; i++) {
                V[i] = scanner.nextInt();
            }
        }

        int count;
        int operatorsCount;
        int soma;
        Set<Integer> setsOfSums = new HashSet<>();

        do {
            soma = 0;
            operatorsCount = 0;
            count = -1;
            while( ++count < V.length && operatorsCount < 2 ){
                if( V[count] <= M && operatorsCount < 2) {
                    V[count] += K;
                    operatorsCount++;
                }
            }
            if(operatorsCount > 1) {

                for(Integer numero : V){
                    soma+= numero;
                }
                setsOfSums.add(soma);
            }
        } while(operatorsCount > 1);

        System.out.println(setsOfSums.size());

    }

}
