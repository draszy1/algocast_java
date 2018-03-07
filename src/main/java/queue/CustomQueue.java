package queue;

import java.util.ArrayList;
import java.util.List;

public class CustomQueue<T> {
    private List<T> backedArray = new ArrayList<>();

    public void push(T elem) {
        backedArray.add(elem);
    }

    public T pop() {
        T elem = backedArray.get(0);
        backedArray.remove(0);

        return elem;
    }

    public T peek() {
        T elem = backedArray.get(0);

        return elem;
    }

    public int size() {
        return backedArray.size();
    }
}
