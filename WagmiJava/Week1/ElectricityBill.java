package WagmiJava.Week1;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = in.nextInt();
        double bill = 0;
        int remUnits;
        remUnits = units;
        //1-100 units at Rs 3/unit
        for (int i = 1; i <= Math.min(remUnits, 100); i++){
            bill = bill + 3;
        }
        remUnits = remUnits - 100;
        //101-200 units at Rs 4.5/unit
        for (int i = 1; i <= Math.min(remUnits, 100); i++){
            bill = bill + 4.5;
        }
        remUnits = remUnits - 100;
        //201-300 units at Rs 6/unit
        for (int i = 1; i <= Math.min(remUnits, 100); i++){
            bill = bill + 6;
        }
        remUnits = remUnits - 100;
        //301+ units at Rs 8/unit
        for (int i = 1; i <= remUnits; i++){
            bill = bill + 8;
        }
        System.out.println(bill);
    }
}
