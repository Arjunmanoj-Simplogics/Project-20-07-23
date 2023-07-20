import java.util.Scanner;

public class Fizzbuzz {
    public static void fizzbuzz(Integer n) {
        for (Integer i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the range:");
        Integer n = s1.nextInt();
        fizzbuzz(n);
    }
}
