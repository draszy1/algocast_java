package lettercount;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class LetterCountTest {
    private static LetterCount letterCount;

    @BeforeAll
    public static void setup() {
        letterCount = new LetterCount();
    }

    @Test
    public void testCounterLambda1() {
        String input = "aaabbccccdd";

        assertThat(letterCount.getMostPopularWithLambda(input)).isEqualTo("c");
    }

    @Test
    public void testCounterLambda2() {
        String input = "aaabbcccdd";

        assertThat(letterCount.getMostPopularWithLambda(input)).isEqualTo("a");
    }

    @Test
    public void testCounterClassic1() {
        String input = "aaabbccccdd";

        assertThat(letterCount.getMostPopularClassic(input)).isEqualTo("c");
    }

    @Test
    public void testCounterClassic2() {
        String input = "aaabbcccdd";

        assertThat(letterCount.getMostPopularClassic(input)).isEqualTo("a");
    }
}
