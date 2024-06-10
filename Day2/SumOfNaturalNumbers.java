package Day2;

public class SumOfNaturalNumbers {

    public int sumUsingForLoop(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
             sum += i;
        }
        return sum;
    }
    public int sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

}


