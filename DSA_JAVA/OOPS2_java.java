public class OOPS2_java {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Siddhi");
        // System.out.println(s2.name);
        // Student s3 = new Student(45);
        // System.out.println(s3.roll);
        s1.name = "siddhi";
        s1.roll = 45;
        s1.password = "abc";
        s1.mark[0] = 100; 
        s1.mark[1] = 90; 
        s1.mark[2] = 80; 
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.mark[0] = 80; 
        for(int i=0; i<3; i++){
            System.out.println(s2.mark[i]);
        }
    }
    
}

class Student{
    String name;
    int roll;
    String password;
    int mark[];

// Copy Constructor or Shallow copy Constructor
//     Student(Student s1){
//        mark = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.mark = s1.mark;
// }

// deep copy Constructor
    Student( Student s1){
       mark = new int[3];
       this.name = s1.name;
       this.roll = s1.roll;
       for(int i=0; i<3; i++){
        this.mark[i] = s1.mark[i];
       }
}
// Function or Constructor- No return type 
// Non-parameterized Constructor
    Student(){
        mark = new int[3];
        System.out.println("Constructor is called...");
    }
// Parameterized Constructor
    Student(String name){
        mark = new int[3];
        this.name = name;
    }
// Parameterized Constructor
    Student (int roll){
        mark = new int[3]; 
        this.roll = roll;
    }
}
