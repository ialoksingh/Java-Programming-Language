public class BitManipulation{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            // Even number
            System.out.println("Even Number");
        }else{
            // Odd Number
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        
    }
}