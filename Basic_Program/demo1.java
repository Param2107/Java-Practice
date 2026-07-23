// import java.util.Scanner;
// class demo1{
// public static void main(String[] args){
//     int a=70;
//     switch(a){
//         default:
//             System.out.println("No matching case");
//             break;
//         System.out.println("Outside the case"); 
//         case 65:
//             System.out.println("a");
//         case 'B':
//             System.out.println("b");
//             }
//     }
// }


// // While Concept 
// import java.util.Scanner;
// class demo1{
//     public static void main(String[] args){
//         int i=10 ;
//         while(i>0){
//             System.out.print(i+" ");
//             i--;
//         }
//     }
// }


import java.util.Scanner;
class demo1{
    public static void main(String[] args){
        int i;
        // for(i=7;i<=100;i+=7)
        for(i=1;i<=100;i++) {
            if(i%7==0)
            System.out.print(i+" ");
        }
    }
}