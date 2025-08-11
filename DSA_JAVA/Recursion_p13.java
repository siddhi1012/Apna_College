public class Recursion_p13 {
    public static int FriendsPairing(int n){
        // base Case
        if( n == 1 || n == 2){
            return n ; 
        }
        //choice
        //single
        int single_pair = FriendsPairing(n-1);
        //pair
        int Pair = FriendsPairing(n-2);
        int total_ways = single_pair + (n-1) * Pair;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));
        
    }
    
}
