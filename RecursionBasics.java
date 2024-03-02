public class RecursionBasics{
    // Print nums in dec order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    // Print nums in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    } 
    // Find factorial of a number
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    // Sum of first n natural numbers
    public static int sumOf(int n){
        if(n==1){
            return 1;
        }
        return n+sumOf(n-1);
    }
    // Print nth Fibonacci number
    public static int fibonacci(int n){
        if((n==0)||(n==1)){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    // Check if given array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // Find first occurence of an element in an array
    public static int findFirst(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findFirst(arr, key, i+1);
    }
    // Find last occurence of a key in an array
    public static int findLast(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findLast(arr, key, i-1);
    }
    // Print x to the power n (Not optimised approach : TC -> O(n))
    // public static int xPowerN(int x, int n){
    //     if(n==1){
    //         return x;
    //     }
    //     return x * xPowerN(x, n-1);
    // }

    // Print x to the power n (Optimised Approach : TC -> O(logn))
    public static int xPowerN(int x,int n){
        if(n==1){
            return x;
        }
        int halfPower = xPowerN(x, n/2);
        int power = halfPower * halfPower;
        if(n%2!=0){
            power = x * power;
        }
        return power;
    }
    public static void main(String args[]){
      System.out.println(xPowerN(2,7));
    }
}