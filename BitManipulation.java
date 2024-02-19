/**
 * BitManipulation
 */
public class BitManipulation {
    // Odd or Even
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    // Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    // Set ith bit
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    // Clear ith Bit
    public static int clearIthBit(int n, int i){
        int bitMask = 1<<i;
        return n^bitMask;
    }
    // Update ith Bit
    public static int updateIthBit(int n,int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        /* one more way */
        clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    // Clear last i bits
    public static int clearLastIBits(int n,int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    // Main Function
    public static void main(String[] args) {
        System.out.println(clearLastIBits(53, 4));
    }
}