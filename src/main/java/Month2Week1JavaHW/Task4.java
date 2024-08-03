package Month2Week1JavaHW;

public class Task4 {
    public static void main(String[] args) {
        int[][] number = {
                {20, 1, 28, 33},
                {91, 69, 34, 85},
                {11, 2, 10, 9}
        };
        int sum = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                if (number[r][c] % 2 == 0) {
                    System.out.print(number[r][c] + " ");
                    sum = sum + number[r][c];
                }
            }
        }
        System.out.println();
        System.out.println("Total Even: " + sum);
        System.out.println();

        int sum2 = 0;
        for (int rr = 0; rr < 3; rr++) {
            for (int cc = 0; cc < 4; cc++) {
                if (number[rr][cc] % 2 != 0) {
                    System.out.print(number[rr][cc] + " ");
                    sum2 = sum + number[rr][cc];
                }
            }
        }
        System.out.println();
        System.out.println("Total Odd "+sum2);
    }
}
