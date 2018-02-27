package fizzbuzz;

public class FizzBuzz {
    public String generate(int n) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringBuffer.append("fizzBuzz");
            } else if (i % 5 == 0) {
                stringBuffer.append("buzz");
            } else if (i % 3 == 0) {
                stringBuffer.append("fizz");
            } else {
                stringBuffer.append(i);
            }
        }

        return stringBuffer.toString();
    }
}
