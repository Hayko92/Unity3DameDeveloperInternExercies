import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("top");
        test.add("aaa");
        test.add("read");
        test.add("stop");
        // test.add("stop");
        test.add("aaa");
        test.add("table");
        test.add("pots");
        test.add("pots");
        test.add("stop");
        test.add("pot");
        System.out.println(reversePairsCount(test));
    }

    public static int reversePairsCount(List<String> words) {
        int res = 0;
        for (int i = 0; i < words.size(); i++) {
            String current = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                String innerCicleString = words.get(j);
                String reversedInnerCicleString = new StringBuilder(innerCicleString).reverse().toString();
                if (current.equals(reversedInnerCicleString)) {
                    words.remove(current);
                    words.remove(innerCicleString);
                    res++;
                    i--;
                    break;
                }

            }
        }
        return res;
    }

}
