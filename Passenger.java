import java.util.Scanner;
class Passenger{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Taxi Number:");
        String num = scan.nextLine();
        System.out.print("Enter Distance Travelled:");
        int dist=scan.nextInt();
        int amount;
        if(dist <= 5)
             amount = 100;
        else if(dist >= 6 && dist <=15)
            amount = 100 + ((dist-5)*10);
        else if(dist > 15 && dist <=25)
            amount = 200 + ((dist-15)*8);
        else 
            amount = 280 +((dist-25) * 5) ;
        System.out.println("Taxi No:"+num);
        System.out.println("Distance Covered:"+dist);
        System.out.println("Amount:"+amount);
    }
}