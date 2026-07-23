class alpha1{
    public static void main(String[] args){
        int n=5;
        int mid=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                if(j==mid-i || j==mid+i || (i==2 && j >=3 && j<=7)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
           }
}