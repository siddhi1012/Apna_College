public class String_compareTo {
    public static void main(String[] args) {
        String fruit[]={"apple","banana","mango"};
        String large= fruit[0];
        for(int i=1; i<fruit.length; i++){
            if(large.compareTo(fruit[i])<0){
                large = fruit[i]; 
            }     
        }
        System.out.println(large);
    }
    
}
