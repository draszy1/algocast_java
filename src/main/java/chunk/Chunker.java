package chunk;

import java.util.ArrayList;
import java.util.List;

public class Chunker {

    public List<List<Integer>> chunk(List<Integer> ints, int chunkSize) {
        List<List<Integer>> chunks = new ArrayList<>();

        for (int intVal : ints) {
            List<Integer> last = chunks.size() == 0 ? null : chunks.get(chunks.size() - 1);

            if (last == null || last.size() == chunkSize) {
                List<Integer> chunk = new ArrayList<>();
                chunk.add(intVal);
                chunks.add(chunk);
            } else {
                chunks.get(chunks.size()-1).add(intVal);
            }
        }

        return chunks;
    }
}
