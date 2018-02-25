package reverse;

public class Reverse {

    public String reverse1(String input) {
        String result = "";

        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }

    public String reverse2(String input) {
        String result = "";

        for (char c : input.toCharArray()) {
            result = c + result;
        }

        return result;
    }
}
