package Month2Week1JavaHW;

import javax.swing.plaf.IconUIResource;

public class TEst {
    public static void main(String[] args) {
       int num=10;
       int member=50;
       int member2=80;
       int discount=10;
       int pool=15;
        if(member>discount || member2>pool){
            System.out.println(member-10);
        }else if(member2>pool){
            System.out.println(member-15);
        }

    }
}
