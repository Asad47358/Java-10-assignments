package Month2Week1JavaHW;

public class Task1 {
    public static void main(String[] args) {

        // Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.

        int [] temp = {30,40,50,60,70,80,90,100};
        int highest=temp[0];
        int lowest=temp[0];

        for(int t=1; t<temp.length; t++) {
            if (temp[t] > highest) {
                highest = temp[t];
            }
        if(temp[t]<lowest) {
            lowest = temp[t];
        }
        }
        System.out.println("Highest temperatures of this week is "+highest+"F");
        System.out.println("Lowest temperatures of this week is "+lowest+"F");


        }
    }

