package chunk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChunkTest {
    private static Chunker chunker;

    @BeforeAll
    public static void setup() {
        chunker = new Chunker();
    }

    @Test
    public void checkChunking1() {
        //given
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);

        //when
        List<List<Integer>> resultChunks = chunker.chunk(ints, 3);

        //then
        assertThat(resultChunks.size()).isEqualTo(3);
        assertThat(resultChunks.get(0).size()).isEqualTo(3);
        assertThat(resultChunks.get(1).size()).isEqualTo(3);
        assertThat(resultChunks.get(2).size()).isEqualTo(2);
        assertThat(resultChunks.get(0).get(0)).isEqualTo(1);
        assertThat(resultChunks.get(0).get(1)).isEqualTo(2);
        assertThat(resultChunks.get(0).get(2)).isEqualTo(3);
        assertThat(resultChunks.get(1).get(0)).isEqualTo(4);
        assertThat(resultChunks.get(1).get(1)).isEqualTo(5);
        assertThat(resultChunks.get(1).get(2)).isEqualTo(6);
        assertThat(resultChunks.get(2).get(0)).isEqualTo(7);
        assertThat(resultChunks.get(2).get(1)).isEqualTo(8);
    }

    @Test
    public void checkChunking2() {
        //given
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);

        //when
        List<List<Integer>> resultChunks = chunker.chunk(ints, 9);

        //then
        assertThat(resultChunks.size()).isEqualTo(1);
        assertThat(resultChunks.get(0).size()).isEqualTo(ints.size());
    }

    @Test
    public void checkChunking3() {
        //given
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);

        //when
        List<List<Integer>> resultChunks = chunker.chunk(ints, 1);

        //then
        assertThat(resultChunks.size()).isEqualTo(ints.size());
    }
}
