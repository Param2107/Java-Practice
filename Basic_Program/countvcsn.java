//// te a program to count the number of vowels and consonants and numbers and special symbols
class countvcns{
    public static void main(String[] args){
        String s ="hi2@ramya";
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c>='0'&& c<='9'){
                count++;
                System.out.println(count)
            }
            elseif(c='a'||c='e'||c='i'||c='o'||c='u'){
                count1++;
                System.out.println(count1);
            }
            elseif(c='@'||c='#'||c='$'||c='&'||c='*'){
                count2++
                System.out.println(count2);
            }
            else{
                count3++;
                System.out.println(count3);
            }

        }

    }
}