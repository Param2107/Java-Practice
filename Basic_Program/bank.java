import java.util.Scanner;
class bank{
    public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Salary Amount");
    int Salary = scan.nextInt();
    System.out.println("Enter Age");
    int age = scan.nextInt();
    if(Salary >= 20000 || age <= 25)
    {
        System.out.println("Eligible for Loan");
        System.out.println("Enter the loan amount");
        int loan = scan.nextInt();
        if(loan <= 50000)
        {
            System.out.println("Eligible for Loan");
        }
        else{
            System.out.println("Maximum amount is 50000");
        }
    }
    else{
        System.out.print("Not Eligible for Loan");
    }

}

}
