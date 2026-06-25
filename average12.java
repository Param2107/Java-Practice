import java.util.Scanner;
class average12{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int sub5 = scan.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5;

        int average = total/5;
        
        if(average < 35)
        {
            System.out.println("Additional class is Required");
        }
        else{
            System.out.println("No course required");
        }

    }
}