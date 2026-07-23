import java.util.Scanner;
class practice{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isprime=true;
        if(n<=1)
        {
            isprime=false;
        }
        
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                isprime=false;
            }
           
        }
            if(isprime)
            {
                System.out.println("The given Number is Prime");
            }
            else{
                System.out.println("The given number is NotPrime");
            }


    }
}