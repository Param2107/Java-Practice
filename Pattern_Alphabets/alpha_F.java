class alpha_F{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                if((i==0 && j>=0 && j<8 ) ||(i==1 && j==0 ) || (i==3 && j==0) || (i==2 && j>=0 && j<8) || (i==4 && j==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}