package Day2;

import java.util.Scanner;

public class MultiplicationTable {
    public void printMultiplicationTable(int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j=1; j<=n; j++){
                System.out.print(" "+i + " x " + j + " = " + i*j);
            }
            }
    }
}
