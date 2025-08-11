public class OOPS_Static {
    public static void main(String[] args) {
        Student s = new Student();
        s.schoolName = "abc";
        System.out.println(s.retrunPercentage(80,60 ,100));
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    
    }
    
}
class Student{
    static int retrunPercentage(int a, int b, int c){
        return (a+b+c)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name; 
    }

    void setRoll(int roll){
        this.roll = roll;
    }

    int getRoll(){
        return this.roll; 
    }
}