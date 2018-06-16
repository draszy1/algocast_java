package summing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {
        User u1 = new User(10, "Max");
        User u2 = new User(20, "Ard");
        User u3 = new User(30, "Fin");
        User u4 = new User(40, "Dun");
        User u5 = new User(50, "Luk");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        Lambdas lambdas = new Lambdas();

        System.out.println("SUM1: " + lambdas.sumAges1(users));
        System.out.println("SUM2: " + lambdas.sumAges2(users));
        System.out.println("Oldest: " + lambdas.oldest(users).getName());
    }

    public int sumAges1(List<User> users) {
        return users.stream().collect(Collectors.summingInt(User::getAge));
    }

    public int sumAges2(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).sum();
    }

    public User oldest(List<User> users) {
        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }
}



class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
