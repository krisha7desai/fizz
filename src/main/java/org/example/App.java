package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        StringBuilder f = new StringBuilder();
        for (int z = 1; z <= 100; z++) {
            String b = fb(z);
            f.append(b);
            if (z < 100) {

                f.append(",");
            }

        }
        System.out.println(f);
    }


    public static String fb(int i) {

        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }


    }
}
