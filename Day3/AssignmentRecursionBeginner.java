package Day3;

public class AssignmentRecursionBeginner {
    public static void main(String[] args) {
        AssignmentRecursionBeginner ass = new AssignmentRecursionBeginner();
        System.out.println(ass.factorial(5));
        System.out.println(ass.sumOfNaturalNumbers(5));
        System.out.println(ass.fibonacci(6));
        System.out.println(ass.sumOfDigits(123));
        System.out.println(ass.reverseString("Hello"));
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int sumOfNaturalNumbers(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sumOfDigits(n / 10));
    }

    public String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}