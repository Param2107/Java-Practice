class alpha_V{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if((i==0) && (j==0 || j==9)|| (i==1)&&(j==1 || j==8)||(i==2 )&& (j==2 || j==7)||(i==3) && (j==3 || j==6)||(i==4 && j==4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
}
