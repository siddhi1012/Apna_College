public class Recursion_p11 {
    // 2 X n (floor Size)
    public static int Tilling_problem(int n){
        //base case
        if( n == 0 || n == 1){
            return 1;
        }
        //Work 
        // Vertical
        int Vertical_Tiles = Tilling_problem(n-1);
        // horizontal
        int Horizontal_Tiles = Tilling_problem(n-2);
        int total_ways = Vertical_Tiles + Horizontal_Tiles ;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(Tilling_problem(4));
     
        

    }
}
