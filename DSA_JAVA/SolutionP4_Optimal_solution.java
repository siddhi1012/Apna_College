public class SolutionP4_Optimal_solution {
    public static boolean get_Anagram(String s1, String s2){
        int count[]= new int[26];
        int n1= s1.length();
        int n2= s2.length();
        if(n1 != n2){
            return false;
        }
        for(int i=0; i<n1; i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        System.out.println(get_Anagram(s1, s2));
    }
    
}
