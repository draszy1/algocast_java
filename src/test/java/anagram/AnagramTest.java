package anagram;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnagramTest {

    private static Anagram anagram;

    @BeforeAll
    public static void setup() {
        anagram = new Anagram();
    }

    @Test
    public void anagramTest1() {
        assertThat(anagram.isAnagram1("!Sranie w banie", "A Rains Newbie")).isTrue();
        assertThat(anagram.isAnagram1("!Sranie w banie", "A Rains Newwbie")).isFalse();
        assertThat(anagram.isAnagram1("!Sranie w banie", "sranie")).isFalse();
    }

    @Test
    public void anagramTest2() {
        assertThat(anagram.isAnagram2("!Sranie w banie", "A Rains Newbie")).isTrue();
        assertThat(anagram.isAnagram2("!Sranie w banie", "A Rains Newwbie")).isFalse();
        assertThat(anagram.isAnagram2("!Sranie w banie", "sranie")).isFalse();
    }
}
