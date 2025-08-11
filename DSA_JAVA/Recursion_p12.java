public class Recursion_p12 {
    public static void RemovesDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // Work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']== true){
            // duplicates character, skip it
            RemovesDuplicates(str, idx+1,newStr, map);
        }else{
            // Unique character add it to result
            map[currChar - 'a']= true;
            RemovesDuplicates(str, idx+1,newStr.append(currChar), map);
        }
      
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        RemovesDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
