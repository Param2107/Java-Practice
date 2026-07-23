import java.util.Scanner;
class divisible{
    public static void main(String args[])
    {
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        //divisible by 3 and 5 use logical operator use &&
        //for division rem=0 take %
        int num = 15;
        if(num%3 == 0 && num % 5 == 0)
    {
        System.out.print("Number is Divisible by 3 And 5");
    }
    else{
        System.out.print("Number is not Divisible by 3 And 5");
    }
    }
}