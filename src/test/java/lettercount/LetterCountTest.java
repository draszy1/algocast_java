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
    public void testCounter1() {
        String input = "aaabbccccdd";

        assertThat(letterCount.getMostPopular(input)).isEqualTo("c");
    }

    @Test
    public void testCounter2() {
        String input = "aaabbcccdd";

        assertThat(letterCount.getMostPopular(input)).isEqualTo("a");
    }
}
