package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ListTest {

    private CustomList<Integer> list;

    @BeforeEach
    public void setup() {
        list = new CustomList<>();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
    }

    @Test
    public void checkAddAtTail() {
        //when
        list.addAtTail(6);

        //then
        assertThat(list.size()).isEqualTo(6);
        assertThat(list.getAtIndex(0)).isEqualTo(1);
        assertThat(list.getAtIndex(5)).isEqualTo(6);
    }

    @Test
    public void checkAddAtHead() {
        //when
        list.addAtHead(6);

        //then
        assertThat(list.size()).isEqualTo(6);
        assertThat(list.getAtIndex(0)).isEqualTo(6);
        assertThat(list.getAtIndex(5)).isEqualTo(5);
    }

    @Test
    public void checkAddAtIndex() {
        //when
        list.addAtIndex(3,6);

        //then
        assertThat(list.size()).isEqualTo(6);
        assertThat(list.getAtIndex(3)).isEqualTo(6);
        assertThat(list.getAtIndex(0)).isEqualTo(1);
        assertThat(list.getAtIndex(1)).isEqualTo(2);
        assertThat(list.getAtIndex(2)).isEqualTo(3);
        assertThat(list.getAtIndex(4)).isEqualTo(4);
    }

    @Test
    public void checkDeleteAtIndex() {
        //when
        list.deleteAtIndex(3);

        //then
        assertThat(list.size()).isEqualTo(4);
        assertThat(list.getAtIndex(0)).isEqualTo(1);
        assertThat(list.getAtIndex(1)).isEqualTo(2);
        assertThat(list.getAtIndex(2)).isEqualTo(3);
        assertThat(list.getAtIndex(3)).isEqualTo(5);
    }
}
