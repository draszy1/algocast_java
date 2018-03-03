package vovel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VovelTest {
    private static Vovel vovel;

    @BeforeAll
    public static void setup() {
        vovel = new Vovel();
    }

    @Test
    public void countTest() {
        assertThat(vovel.count("Sranie w banie")).isEqualTo(6);
    }
}
