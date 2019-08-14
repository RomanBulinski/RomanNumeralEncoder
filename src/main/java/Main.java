import java.util.*;

public class Main {

    public String solution( int n) {

        Map<Integer, List<String>> indexer = new HashMap<>();

        indexer.put(1, Arrays.asList("I", "X", "C"));
        indexer.put(5, Arrays.asList("V", "L", "D"));
        indexer.put(9, Arrays.asList("IX", "XC", "CM"));

        String result = "";
        String num = String.valueOf(n);
        String[] stringDigits = num.split("");

        Collections.reverse(Arrays.asList(stringDigits));

        for (int i = 0; i < stringDigits.length; i++) {
            int tempInt = Integer.valueOf( stringDigits[i] );
            if(tempInt!=0){
                result = indexer.get(tempInt).get(i) + result;
            }
        }

        return result;

    }


}
