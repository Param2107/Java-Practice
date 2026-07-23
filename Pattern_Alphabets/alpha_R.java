class alpha_R{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=0;j<10;j++){
                if((i==0 || i==2) && (j>=0 && j<4)|| i==1  && (j==0 || j==3) || (i==3) && (j==0 || j==1)|| 
                (i==4) && (j==0 || j==2) || (i==5) && (j==0 || j==3)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
