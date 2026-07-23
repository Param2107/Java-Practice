class alpha_B{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                if(((i==0 || i==4) && j>=0 && j<5 ) ||((i==1  || i==3) && (j==0 || j==4)||(i==2 && (j>=0 && j<4)))){
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