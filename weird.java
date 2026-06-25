import java.util.Scanner;
class weird{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if(n%2==0){
            if(n>1 && n<=5 || n>20)
                System.out.println("Not Weird");
            
             else if(n>=6 && n<=20)
                System.out.println("Weird");                  
            
        }
        else
                System.out.println("Weird");
            
    }
}