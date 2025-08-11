public class Shortest_path_String {
    public static float get_short_path(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='W'){
                x--;
            }else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2); 

    }
public static void main(String[] args) {
    String path="WNEENESENNN";
    System.out.println(get_short_path(path));
}
    
}
