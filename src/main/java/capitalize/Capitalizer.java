package capitalize;

public class Capitalizer {
    public String capitalize1(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = word.replaceFirst(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(0)).toUpperCase());
            sb.append(capitalizedWord).append(" ");
        }

        return sb.toString().trim();
    }

    public String capitalize2(String input) {
        char[] result = new char[100];
        char[] inputChars = input.toCharArray();

        result[0] = Character.toUpperCase(inputChars[0]);

        for (int i = 1; i < inputChars.length; i++) {
            if (inputChars[i-1] == ' ') {
                result[i] = Character.toUpperCase(inputChars[i]);
            } else {
                result[i] = inputChars[i];
            }
        }

        return String.valueOf(result).trim();
    }
}
