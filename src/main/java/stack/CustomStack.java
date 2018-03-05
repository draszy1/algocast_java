package stack;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {
    private List<T> backedArray;

    public CustomStack() {
        backedArray = new ArrayList<>();
    }

    public T pop() {
        T elem = backedArray.get(backedArray.size() - 1);
        backedArray.remove(elem);

        return elem;
    }

    public T peek() {
        T elem = backedArray.get(backedArray.size() - 1);

        return elem;
    }

    public void push(T elem) {
        backedArray.add(elem);
    }

    public int size() {
        return backedArray.size();
    }
}
