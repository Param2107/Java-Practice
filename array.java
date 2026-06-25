// import java.util.Scanner;
// class array{
//     public static void main(String[]args){
//         Scanner scan=new Scanner(System.in);
//         int score[]=new int[5];
//         for(int i=0;i<=4;i++){
//             score[i]= scan.nextInt();
//                   }
//         for (int i=0;i<=4;i++){
//             System.out.println("SCORE:"+score[i]);
//         }

//         // score[0]=scan.nextInt();
//         // score[1]=scan.nextInt();
//         // score[2]=scan.nextInt();
//         // score[3]=scan.nextInt();
//         // score[4]=scan.nextInt();
//         // System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
//     }
// }

import java.util.Scanner;
class array{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        
    
    for(int i=0;i<=9;i=i+1){
        arr[i]=scan.nextInt();
       
         
    }
    for(int i=0;i<=9;i++){
        System.out.println("print"+arr[i]);
    }
    }
    

}
