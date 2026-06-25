import java.util.Scanner;
class digit{
    public static void main(String[]args)
    {
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            int n = i*i;
            int r = n%10;      
            if(i==r)
            {
                System.out.println(n+ " is the square of digit " +i);
            }
        }
    }
}