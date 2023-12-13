public class JavaBasics{
    // Sum of 2 no.
    public static int printSum(int a,int b){
        return (a+b);
    }
    // Print Hello World 3 times
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    // Swap numbers
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    // Product of two numbers
    public static int multiply(int a,int b){
        return a*b;
    }
    // Factorial of a number
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    // Binomial Coefficient
    public static int binCoefficient(int n,int r){
        int nf = factorial(n);
        int rf = factorial(r);
        int nmrf = factorial(n-r);
        return nf/(rf*nmrf);
    }
    // Prime or not (optimized)
    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    // Print all primes in range
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    // Binary to Decimal
    public static int bin2Dec(int  n){
        int dec = 0, i = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit*(int)(Math.pow(2,i)));
            i++;
            n/=10;
        }
        return dec;
    }
    // Decimal to Binary
    public static int dec2Bin(int n){
        int bin = 0, i = 0;
        while(n>0){
            bin = bin + (n%2)*((int)Math.pow(10, i));
            n/=2;
            i++;
        }
        return bin;
    }
    public static void digitSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }
    // Palindrome or not
    public static void palindrome(int n){
        int x = n, rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n/=10;
        }
        if(x==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    // Main Function
    public static void  main(String args[]){
        
    }
}