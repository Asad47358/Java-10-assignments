package Month2Week1JavaHW;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write a number:");
        int user = input.nextInt();

       int count =0;
       for(int i=1; i<=user; i++){
           if(user%i==0){
               count++;
           }
       }
       if(count==2){
           System.out.println("Prime");
       }else{
           System.out.println("Not Prime");
       }
    }
}
