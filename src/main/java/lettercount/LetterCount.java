package lettercount;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterCount {

    public String getMostPopularWithLambda(String input) {

        return input.chars().boxed().collect(Collectors.groupingBy(i -> Character.valueOf((char) i.intValue()), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey().toString();

    }

    public String getMostPopularClassic(String input) {
        String result = "";
        Map<Character, Integer> letterMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            int currentCounter = letterMap.get(c) == null ? 0 : letterMap.get(c);

            if (currentCounter == 0) {
                letterMap.put(c, 1);
            } else {
                letterMap.put(c, ++currentCounter);
            }
        }

        int max = 0;

        for (Map.Entry e : letterMap.entrySet()) {
            if ((int)e.getValue() > max) {
                max = (int) e.getValue();
                result = e.getKey().toString();
            }
        }

        return result;
    }
}
