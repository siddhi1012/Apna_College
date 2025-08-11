public class Array1 {
    // call by referance
    public static void update(int marks[],int nonchange){
         nonchange=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }

    }
    public static void main(String[] args) {
        int nonchange=5;
        int marks[]={97,98,99};
        update(marks,nonchange);
        System.out.println("nonchange-"+nonchange);
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        
    }
    
}
