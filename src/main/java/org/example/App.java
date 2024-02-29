package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {}
    public static String fb(int i){

        if (i% 3 == 0) {
            return "Fizz";
            }
        else if (i% 5 == 0) {
            return "Buzz";
        }


        return Integer.toString(i);
    }
}
