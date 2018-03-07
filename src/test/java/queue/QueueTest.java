package queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QueueTest {
    private static CustomQueue<Integer> queue;

    @BeforeAll
    public static void setup() {
        queue = new CustomQueue<>();
        queue.push(3);
        queue.push(6);
        queue.push(8);
        queue.push(1);
    }

    @Test
    public void checkPush() {
        assertThat(queue.size()).isEqualTo(4);
    }

    @Test
    public void checkPop() {
        assertThat(queue.pop()).isEqualTo(3);
        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    public void checkPeek() {
        assertThat(queue.peek()).isEqualTo(3);
        assertThat(queue.size()).isEqualTo(4);
    }
}
