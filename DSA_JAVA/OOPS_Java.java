public class OOPS_Java {
    public static void main(String[] args) {
        // Crated an Object
        Pen p1 = new Pen();
        p1.setColor("Purple");
        System.out.println(p1.getColor());
        p1.setTip(67 );
        System.out.println(p1.getTip());
        BankAccount ac = new BankAccount();
        ac.username = "siddhi@1012";
        ac.setPassword("siddhi1012");

    }
   
}
class Pen{
    private String color;
    private int tip;
    int getTip(){
        return this.tip = tip;
    }

    String getColor(){
        return this.color = color;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}

