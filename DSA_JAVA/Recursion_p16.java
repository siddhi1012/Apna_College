public class Recursion_p16 { // Starting index -> i , Ending Index -> j
    public static int countSubstr(String str, int i, int j, int n){
        //base case
        if(n == 1 || n <= 0){
            return n;
        }
        int res = countSubstr(str, i+1, j, n-1)+ // Exclude start character
                  countSubstr(str, i, j-1, n-1)- // Exclude end character
                  countSubstr(str, i+1, j-1, n-2); // Exclude both end

                  if(str.charAt(i) == str.charAt(j)){
                    // check i to j start and end with same character 
                    res++;
                  }
                  return res;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstr(str, 0, n-1, n));
    }
    
}
