public class Operation_bitwise {
    public static int get_ith_bit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)== 0){
            return 0;
        }
        return 1;
    }

    public static int set_ith_bit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask ;
    }

    public static int clear_ith_bit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }

    public static int Update_ith_bit(int n, int i, int newBit){
        n = clear_ith_bit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clear_last_ith_bit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clear_range_of_bit(int n,int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b ;
        return n & bitMask;
    }

    public static boolean isPowerif2orNot(int n){
        return ( n&(n-1))==0;
    }

    public static int count_set_bit(int n){
        int count = 0;
       while(n>0){
        if((n&1)!=0){
            count++;
        }
        n = n>>1;
       }
       return count;
    }

    public static int fast_Exponentiation(int a, int n){
        int ans = 1;
        while(n>0){
          if((n&1)!=0){
            ans = ans *a;
          }
          a= a*a;
          n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("get_ith_bit: "+get_ith_bit(10, 2));
        System.out.println("set_ith_bit: "+set_ith_bit(10, 2));
        System.out.println("clear_ith_bit: "+clear_ith_bit(10, 1));
        System.out.println("Update_ith_bit: "+Update_ith_bit(10, 2, 1));
        System.out.println("clear_last_ith_bit: "+clear_last_ith_bit(15, 2));
        System.out.println("clear_range_of_bit: "+clear_range_of_bit(10,2, 4));
        System.out.println("isPowerif2orNot: "+isPowerif2orNot(16));
        System.out.println("count_set_bit:"+count_set_bit(10));
        System.out.println("fast_Exponentiation:"+fast_Exponentiation(3, 5));


    }
    
}
