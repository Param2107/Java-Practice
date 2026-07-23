// import java.util.Scanner;
// class game11{
//     public static void main(String args[]){
//         // int score = 70;
//         Scanner scan = new Scanner(System.in);
//         int score = scan.nextInt();
//         if(score < 50)
//         {
//              System.out.println("YOU NEED TO IMPROVE.");
//         }
//         else if(score >= 50 && score <= 70)
//         {
//             System.out.println("GOOD JOB");
//         }
//         else
//         {
//             System.out.println("Excellent Performance");
//         }
       
//     }

// }
import java.util.Scanner;
class game11{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score>=90){
             System.out.println("I get MacBook pro!!");
        }
           
        else if(score>=60 && score<90)
        {
            System.out.println("I get Iphone");
         }
         else if(score>=35 && score<60)
         {
            System.out.println("I get Android");
         }
        else{
            System.out.println("I get Videogame");
        }
        
    }
}