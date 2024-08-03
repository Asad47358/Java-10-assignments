package Month2Week1JavaHW;

public class Task10 {
    public static void main(String[] args) {
        String[] CarPart={"Brakes","Door","Door","Engine","Engine","Dashboard","Parking Brake","light","light"};
        System.out.println("Duplicate elements in given array:");
        for(int i=0; i< CarPart.length; i++) {
                for(int a=i+1; a< CarPart.length; a++){
                    if(CarPart[i].equalsIgnoreCase(CarPart[a])){
                        System.out.println(CarPart[i]);

                    }

                }

        }
    }
}
