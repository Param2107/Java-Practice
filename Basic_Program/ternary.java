import java.util.Scanner;
class ternary{
    
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int greater = (n1>n2)?n1:n2;
    System.out.print("The greater number is "+greater);
    // System.out.print(n1>n2?"n1 is greater":"n2 is greater");
    }

}
