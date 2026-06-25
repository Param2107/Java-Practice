import java.util.Scanner;
class countstring{
    public static void main(String[] args){
        String s ="tec3h 8high 53 eng";

        String s1= " ";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c>='0' && c<='9'){
                s1=s1+c;
            }
            else{
                if(!s1.isEmpty()){
                    sum=sum + Integer.parseInt(s1);

                }
            }
            if(!s1.isEmpty){
                sum=sum+ Integer.parseInt(s1);
            }
        }
        System.out.println("Total values: " +sum);

    }
}
