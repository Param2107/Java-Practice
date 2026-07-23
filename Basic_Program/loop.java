// import java.util.Scanner;
// class loop{
//     public static void main(String args[])
//     {
//         // for(int i=5;i>=1;i--)
//         // {
//         //     System.out.println(i);
//         // }
        
//         // for loop from a=2 to a=10
//         // Scanner scan = new Scanner(System.in);
//         // int a = scan.nextInt();
//         // int b = scan.nextInt();
//         // for(int i=a;i<=b;i++)
//         // {
//         //     System.out.println(i);
//         // }
        
        


    // }

    // }

    // EVEN NUMBER BETWEEN 1 tO 10 
// // import java.util.Scanner;
// // ODD COUNT BETWEEN 1 to 10

class loop {
    public static void main(String args[]) {
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // System.out.println("The Even Number is " + i);
            }
            else
            {
                count = count+1;
                 
                System.out.println("The Odd Number is " +i);
            }
        }
        System.out.println(count);
    }
}

