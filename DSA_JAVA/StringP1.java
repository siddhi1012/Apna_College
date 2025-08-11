import java.util.Scanner;

public class StringP1 {
    public static int String_vowel(String str){
         int count=0;
        for(int i=0; i<str.length(); i++){
            if(isVowel(str.charAt(i))){
                count++;
            }

        }
        return count;
    } 
    public static boolean isVowel(char ch){
        return(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U');
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Number of Vowels:"+ String_vowel(str));
    }
    
}
