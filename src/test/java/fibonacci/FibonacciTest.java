package fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FibonacciTest {
    private static Fibonacci fibonacci;

    @BeforeAll
    public static void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void generate1Test() {
        assertThat(fibonacci.generate1(4)).isEqualTo(3);
        assertThat(fibonacci.generate1(5)).isEqualTo(5);
        assertThat(fibonacci.generate1(6)).isEqualTo(8);
        assertThat(fibonacci.generate1(7)).isEqualTo(13);
        assertThat(fibonacci.generate1(8)).isEqualTo(21);
    }

    @Test
    public void generate2Test() {
        assertThat(fibonacci.generate2(4)).isEqualTo(3);
        assertThat(fibonacci.generate2(5)).isEqualTo(5);
        assertThat(fibonacci.generate2(6)).isEqualTo(8);
        assertThat(fibonacci.generate2(7)).isEqualTo(13);
        assertThat(fibonacci.generate2(8)).isEqualTo(21);
    }
}
