// import java.util.Scanner;
// class whileloop{
//     public static void main(String[]args){
//         int i=1;
//         while(i<=10){
//               System.out.println(i);
//                     i++;
           
            
//         }
         

//     }
// }
import java.util.Scanner;
class whileloop{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        int fact=1;
        for(int i=1;i<=num;i++){
            int digit=num%10;
            fact=fact*i;
            sum=sum+fact;
        }
        num=num/10;
         System.out.println(sum); 
    }        
  }