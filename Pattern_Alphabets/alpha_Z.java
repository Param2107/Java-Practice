class alpha_Z{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if((i==0 || i==4) && (j>=0 && j<5)|| (i>0 || i<4 && j== 5-i) ){
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
