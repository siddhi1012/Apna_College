public class get_toUpperCase {
    public static String get_uppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ' ' &&  i<str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str="hi, i am siddhi";
        System.out.println(get_uppercase(str));
       
    }
    
}
