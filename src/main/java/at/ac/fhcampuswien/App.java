package at.ac.fhcampuswien;

/*import com.sun.tools.jdeprscan.scan.Scan;*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        char Z = 90;
        int x = 64206;
        int a = 012;
        long b = 80L;
        float c = 44e-1f;
        float d = 5.5f;
        double e = 8.88e1;
        double f = 99.9;


        float g = (int) c;
        float h = (int) d;
        double i = (int) e;
        double j = (int) f;
        long k = (int) b;

        int sum = (char) Z + (int) a + (int) x + (int) c + (int) d + (int) +(int) e + (int) f + (int) b;
        System.out.println("" + sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner x = new Scanner(System.in);

        int a;
        a = x.nextInt();
        int b;
        b = x.nextInt();
        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        System.out.println("Before Swap:");
        Scanner x = new Scanner(System.in);


        System.out.print("x: ");
        int a;
        a = x.nextInt();
        System.out.print("y: ");
        int b;
        b = x.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: " + b);
        System.out.println("y: " + a);

    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        Scanner n = new Scanner(System.in);

        System.out.print("n1: ");
        int a;
        a = n.nextInt();
        System.out.print("n2: ");
        int b;
        b = n.nextInt();
        if (a > b) {
            System.out.println("n1 > n2");
        } else if (b > a) {
            System.out.println("n2 > n1");
        } else System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        Scanner r = new Scanner(System.in);
        int a;
        a = r.nextInt();

        if (a < 0 || a >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (a >= 0 && a < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (a >= 20000 && a < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (a >= 50000 && a < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (a >= 80000 && a < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        Scanner c = new Scanner(System.in);
        int a;
        a = c.nextInt();

        switch (a) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        System.out.print("Year:");
        Scanner y = new Scanner(System.in);
        int a;
        a = y.nextInt();

        if ((a % 4 == 0) && (a % 400 == 0)) {
            System.out.println(" Leapyear");
        } else if ((a % 100 == 0) || (a % 400 != 0)) {
            System.out.println(" Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        /**
         * The following lines of Code have been taken from the Internet | https://www.youtube.com/watch?v=XlbzvgpHIDw&ab_channel=MeganadhaReddy
         * last visit: 29.09.2022 */
        int n;
        int rev = 0;
        int rem;
        int m;

        System.out.print("Number: ");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();

        m = n;
        while (m>0){
            rem = m % 10;
            m = m / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(""+rev);

    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}