package Month2Week1JavaHW;

public class Task8 {
    public static void main(String[] args) {
        int[][] number = {
                {10, 55, 89, -3, 2, 80, 93, 11},
                {3, 5, 77, 9, 22, 12, 7, 50},
                {79, 38, 99, 1, 67, 5, 4, 55}
        };
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    System.out.println(number[i][j]);
                }

            }
        }
    }
}
