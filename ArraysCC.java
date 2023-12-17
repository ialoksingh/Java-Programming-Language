import java.util.*;
// Array Problems
public class ArraysCC{
    // Linear Search
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    // Largest and Smallest Element in an array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            largest = Math.max(largest,numbers[i]);
            smallest = Math.min(smallest,numbers[i]);
        }
        System.out.println(smallest);
        return largest;
    }
    // Binary Search (Pre-requisite: Sorted Array)
    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(key<numbers[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    // Reverse an array
    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length-1;
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    // Pairs in an array
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    // Print all subarrays
    public static void printSubArrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Max Subarray Sum-I(Brute Force)
    // public static void maxSubarraySum(int numbers[]){
    //     int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             int sum = 0;
    //             for(int k=i;k<=j;k++){
    //                 sum += numbers[k];
    //             }
    //             largest = Math.max(sum,largest);
    //             smallest = Math.min(sum,smallest);
    //         }
    //     }
    //     System.out.println("Largest: "+largest+"\nSmallest: "+smallest);
    // }

    // // Max Subarray Sum-II (Prefix Sum)
    // public static void maxSubArraySum(int arr[]){
    //     int maxSum = Integer.MIN_VALUE, currSum = 0;

    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             currSum = (i==0)? prefix[j] : (prefix[j] - prefix[i-1]);
    //         }
    //         maxSum = Math.max(currSum,maxSum);
    //     }

    //     System.out.println("MAX SUM : "+maxSum);
    // }

    // Max Subarray Sum (Kadane's Algorithm)
    public static void kadanes(int numbers[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs += numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("MAX SUM: "+ms);
    }
    // Trapping Rainwater
    public static int trappingRainWater(int height[]){
        int n = height.length;

        // left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            // water level = min(leftmax,rightmax)
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            // trapped water = (waterlevel - height) * width) [HERE, Width=1]
            trappedWater += (waterLevel-height[i]);
        }
        return trappedWater;
    }
    // Buy and Sell Stocks
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    }
}