import java.util.*;

public class Main {

    public String solution( int n) {

        Map<Integer, List<String>> indexer = getIntegerListMap();

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


    private Map<Integer, List<String>> getIntegerListMap() {
        Map<Integer, List<String>> indexer = new HashMap<>();

        indexer.put(1, Arrays.asList("I", "X", "C", "M"));
        indexer.put(2, Arrays.asList("II", "XX", "CC","MM"));
        indexer.put(3, Arrays.asList("III", "XXX", "CCC","MMM"));
        indexer.put(4, Arrays.asList("IV", "XL", "CD"));
        indexer.put(5, Arrays.asList("V", "L", "D"));
        indexer.put(6, Arrays.asList("VI", "LX", "DC"));
        indexer.put(7, Arrays.asList("VII", "LXX", "DCC"));
        indexer.put(8, Arrays.asList("VIII", "LXXX", "DCCC"));
        indexer.put(9, Arrays.asList("IX", "XC", "CM"));


        return indexer;
    }


}
