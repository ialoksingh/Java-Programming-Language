public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        System.out.println(p1.getClass());
    }
}
class Pen{
    // Properties
    private String color;
    private int tip;
    // Getter Methods
    String getColor(){
         return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // Setter Methods
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}