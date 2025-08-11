public class Tower_of_Hanoi {
    public static void Hanoi(int n , char A, char B, char C){
        // base case
        if(n == 0){
            return;
        }
        Hanoi(n-1, A, C, B);
        System.out.println(A+" "+"to"+" "+C);
        Hanoi(n-1, B, A, C);
    }
    public static void main(String[] args) {
        Hanoi(3, 'A', 'B', 'C');
    }
    
}
