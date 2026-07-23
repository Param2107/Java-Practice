class alpha_J{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if((i==0 ) && (j>=0 && j<5)|| (i==1 || i==2 || i==3) && (j==2) || (i==4 && (j>=0 && j<3))){
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
