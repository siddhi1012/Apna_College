public class hollowRectangle {
    public static void HollowRectangle(int n,int m){
        //outer loops
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m)
                {
                    
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        HollowRectangle(4,5 );
        
    }
    
}
