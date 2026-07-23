import java.util.Scanner;
class mark{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark > 34)
        {
            System.out.print("PASS");
        }
        else{
             System.out.print("FAIL");
        }
        
    }
}