package vovel;

public class Vovel {
    public int count(String input) {
        int counter = 0;

        for (char c : input.toCharArray()) {
            boolean isVovel = (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'y');

            if (isVovel) {
                counter++;
            }
        }

        return counter;
    }
}
