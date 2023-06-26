//Andrew Masone

/*
The formula to calculate windchill temperature is given as follows:
twc = 35.74 + 0.6215ta − 35.75v^0.16 + 0.4275tav^0.16
where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured in
miles per hour. Write a Java program that prompts the user to enter a temperature between −58◦F
and 41◦F and a wind speed greater than or equal to 2 and displays the windchill temperature. Also,
the program should display a message for the following cases:
 */

import java.util.Scanner;
import java.lang.Math;

public class Problem2_3 {
    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter outside temperature between -58F and 41F: ");
        double ta = sc1.nextInt();
        System.out.print("Enter wind speed greater than or equal to 2: ");
        double v = sc1.nextInt();

        if(ta>41||ta<-58){
            System.out.println("Temperature out of range please input again.");
            ta = sc1.nextInt();
        }
        if(v<2){
            System.out.println("Wind speed is out of range.");
            v = sc1.nextInt();
        }

        double twc=(35.74)+(.6215*ta)-(35.75*(Math.pow(v,0.16)))+(.4275*ta*(Math.pow(v,.16)));
        System.out.println("The wind chill index is " +twc);

        if(twc<30.0 && twc>16.0){
            System.out.println("COLD. Unpleasant");
        }
        if(twc<15.0 && twc>1.0){
            System.out.println("VERY COLD. Very unpleasant");
        }
        if(twc<1.0 && twc>-21.0){
            System.out.println("BITTER COLD. Frostbite possible");
        }
        if(twc<-21.0){
            System.out.println("EXTREMELY COLD. Frostbite likely. Outdoor activities become dangerous.");
        }

    }
}
