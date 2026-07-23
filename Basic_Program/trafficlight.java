import java.util.Scanner;
class trafficlight{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        if(color.equals("red"))
        {
            System.out.print("STOP");
        }
        else if(color.equals("yellow"))
        {
            System.out.print("WAIT");
        }
        else if(color.equals("green"))
        {
            System.out.print("GO");
        }
    }

}
