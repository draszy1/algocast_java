package fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    public static void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizz3Test() {
        assertThat(fizzBuzz.generate(3)).isEqualTo("12fizz");
    }

    @Test
    public void fizz5Test() {
        assertThat(fizzBuzz.generate(5)).isEqualTo("12fizz4buzz");
    }

    @Test
    public void fizz15Test() {
        assertThat(fizzBuzz.generate(15)).isEqualTo("12fizz4buzzfizz78fizzbuzz11fizz1314fizzBuzz");
    }
}
