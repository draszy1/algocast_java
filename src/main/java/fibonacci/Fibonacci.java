package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int generate1(int limit) {
        List<Integer> result = new ArrayList<>();

        result.add(0);
        result.add(1);

        for (int i = 2; i <= limit; i++) {
            result.add(result.get(i-1) + result.get(i-2));
        }

        return result.get(limit);
    }

    public int generate2(int limit) {

       if (limit < 2) {
           return limit;
       }

       return generate2(limit-1) + generate2(limit-2);
    }
}
