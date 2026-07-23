import java.util.Scanner;
class steel{
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Hardness:");
    int h = scan.nextInt();
    System.out.print("carbon:");
    float c =scan.nextFloat();
    System.out.print("Tensile Strength:");  
    int ts =scan.nextInt(); 
    if(h>60 && c>0.8f && ts>5700)
    System.out.println("Class A");
    else if(h>60 && c>0.8f)
    System.out.println("Class B");
    else if(h>60 && ts>5700)
    System.out.println("Class C");
    else if(c>0.8f && ts > 5700)
    System.out.println("Class D");
    else if(h>60 || c>0.8f || ts>5700)
    System.out.println("Class E");
    else 
    System.out.println("Class F");
     

} 
}