import java.util.Scanner;

class name{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My Age is "+age);
        System.out.print("My Address is "+address);
    }
}