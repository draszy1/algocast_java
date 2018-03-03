package capitalize;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CapitalizerTest {
    private static Capitalizer capitalizer;

    @BeforeAll
    public static void setup() {
        capitalizer = new Capitalizer();
    }

    @Test
    public void capitalizeTest1() {
        assertThat(capitalizer.capitalize1("ala, ma kota")).isEqualTo("Ala, Ma Kota");
    }

    @Test
    public void capitalizeTest2() {
        assertThat(capitalizer.capitalize2("ala, ma kota")).isEqualTo("Ala, Ma Kota");
    }
}
