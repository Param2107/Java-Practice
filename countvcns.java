//te a program to count the number of vowels and consonants and numbers and special symbols
class countvcns{
    public static void main(String[] args){
        String s ="hi2@ramya";
        int num=0, vowels=0, cons=0, sym=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c>='0'&& c<='9'){
                num++;
                System.out.println("num:" +num);
            }
            else{
                sym++;
                System.out.println("Sym:"sym);
            }
            }

        }

    }