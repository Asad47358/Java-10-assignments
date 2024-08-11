package Month2Week1JavaHW;

public class Task3 {
    public static void main(String[] args) {

        int[][] OddEven = {
                {22,39,6,80,7,2,103},
                {3,66,75,90,5,68,11},
                {45,5,20,1,72,13,100}
        };
        System.out.println("This is the Even Numbers:");
        for(int r=0; r<OddEven.length; r++){
            for (int c=0; c<OddEven[r].length; c++){

                if(OddEven[r][c]%2==0){

                    System.out.print(+OddEven[r][c]+ " ");
                }
            }

        }

    }
}
