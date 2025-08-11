public class Printing_character {
    public static void Print_char(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String fullName= "Siddhi Gavhane";
        Print_char(fullName);
    }
    
}
