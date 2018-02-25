package reverse;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReverseTest {

    private static Reverse reverse;

    @BeforeAll
    public static void setup() {
        reverse = new Reverse();
    }

    @Test
    public void testReverse1() {
        String input = "Sraka";

        assertThat(reverse.reverse1(input)).isEqualTo("akarS");
    }

    @Test
    public void testReverse2() {
        String input = "Sraka";

        assertThat(reverse.reverse2(input)).isEqualTo("akarS");
    }
}
