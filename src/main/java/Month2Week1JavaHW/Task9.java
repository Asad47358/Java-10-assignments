package Month2Week1JavaHW;

public class Task9 {
    public static void main(String[] args) {


        int[] number = {4, 90, 98, 45, -9, 88, 1,};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest) {
                secondLargest = number[i];
            }
        }

        System.out.println("Second highest number is: " + secondLargest);
    }
}
