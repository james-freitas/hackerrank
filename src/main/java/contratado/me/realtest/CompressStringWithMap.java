package contratado.me.realtest;


import java.util.*;

public class CompressStringWithMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNext("[A-Za-z]+")) {
            scanner.next();
        }

        String s = scanner.next();

        if (s.length() < 1024) {
            char[] letters = s.toCharArray();
            int count = -1;

            SortedMap<Character, Integer> lettersMap = new TreeMap<>();

            while ( ++count < letters.length  ){
                if ( lettersMap.containsKey(letters[count]) ) {
                    lettersMap.replace(letters[count], lettersMap.get(letters[count]) + 1 );
                } else {
                    lettersMap.put(letters[count], 1);
                }
            }

            StringBuilder sb = new StringBuilder();

            for (Map.Entry<Character, Integer> pair : lettersMap.entrySet()){
                if (pair.getValue() == 1) {
                    sb.append( pair.getKey() );
                } else {
                    sb.append(pair.getKey() + "" + pair.getValue());
                }
            }

            System.out.println(sb.toString());


        }

    }
}
