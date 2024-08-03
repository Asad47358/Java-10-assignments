package Month2Week1JavaHW;

public class Task2 {

    public static void main(String[] args) {

        int[] num = {20, 30, 10, 25, 15, 5};

        int sum = 0;

        for(int i = 0; i<num.length; i++){

            sum = sum+num[i];
        }
        System.out.println("Calculated number: "+sum);
    }
}
