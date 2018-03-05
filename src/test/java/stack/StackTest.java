package stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StackTest {
    private static CustomStack<Integer> stack;

    @BeforeAll
    public static void setup() {
        stack = new CustomStack<>();
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(1);
    }

    @Test
    public void checkPush() {
        assertThat(stack.size()).isEqualTo(4);
    }

    @Test
    public void checkPop() {
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    public void checkPeek() {
        assertThat(stack.peek()).isEqualTo(1);
        assertThat(stack.size()).isEqualTo(4);
    }
}
