public class SubString_of_String {
    public static String get_subString(String str, int si, int ei){
        String substr=" ";
        for(int i=si; i<ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(get_subString(str,0,4));
    }
    
}
