import java.util.Scanner;

public class Fibanacci {

    public static void fibanacci(Integer n) {
        Integer num1 = 0, num2 = 1, num3, i;
        System.out.print(num1 + " " + num2 + " ");
        for (i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the no to print Fibanocci:");
        Integer n = s1.nextInt();
        fibanacci(n);
    }
}
