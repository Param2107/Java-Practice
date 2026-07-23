import java.util.Scanner;
class score{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        Double mark = scanner.nextDouble();
        scanner.nextLine();
        String dept = scanner.nextLine();
        System.out.println("My Name is "+Name);
        System.out.println("My score is "+mark/10+"/10");
        System.out.println("My Department is "+dept);
    }
}