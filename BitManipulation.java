/**
 * BitManipulation
 * Note: x^x is always 0.
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
    // Clear bits in range
    public static int clearBitsInRange(int n,int i,int j){
        int a = clearLastIBits(n, j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
    // Power of Two or not
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    // Add one to an integer using Bit Manipulation
    public static int addOne(int n){
        return ((~n)*(-1));
    }
    // Count set bits
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    // Fast Exponentiation
    public static int fastExponentiation(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){ // Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    // Swap using bits
    public static void swap(int x,int y){
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("x="+x+", y="+y);
    }
    // Uppercase to lowercase and vice-versa
    public static void changeCase(char a, char b){
        a = (char) (a|32); //for lowercase do OR
        b = (char) (b^32); //for Uppercase do XOR
        System.out.println(a+","+b);
    }
    // Main Function
    public static void main(String[] args) {
        changeCase('A','b');
    }
}