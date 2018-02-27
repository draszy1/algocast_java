package lettercount;

import java.util.Map;
import java.util.stream.Collectors;

public class LetterCount {

    public String getMostPopular(String input) {

        return input.chars().boxed().collect(Collectors.groupingBy(i -> Character.valueOf((char) i.intValue()), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey().toString();

    }
}
