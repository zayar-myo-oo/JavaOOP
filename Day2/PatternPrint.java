package Day2;

public class PatternPrint {
    public void PatternA() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public void PatternB() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void PatternC() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void PatternD() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void PatternE() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void PatternF() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
