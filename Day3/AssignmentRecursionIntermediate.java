package Day3;

public class AssignmentRecursionIntermediate {
    public static void main(String[] args) {
        AssignmentRecursionIntermediate ass = new AssignmentRecursionIntermediate();
        System.out.println(ass.power(2, 3));
        System.out.println(ass.power(2, -3));

        ass.towerOfHanoi(3,'A','C','B');
        ass.isPalindrome("racecar");
        ass.stringToInt("Hello");
        ass.gcd(3,6);
        }

    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        return base * power(base, exponent - 1);
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public int stringToInt(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            int firstDigit = Character.getNumericValue(s.charAt(0));
            return firstDigit * (int) Math.pow(10, s.length() - 1) + stringToInt(s.substring(1));
        }
    }
    public void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
