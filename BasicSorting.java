import java.util.Arrays;
import java.util.Collections;
public class BasicSorting{
    // Bubble Sort
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    // Print Array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    // Insertion Sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // Find position
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev+1] = curr;
        }
    }
    // Counting Sort
    public static void countingSort(int arr[]){
        // Find max element for range of count Array
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        // Count Array
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    // *********************DESCENDING ORDER******************
    // // Bubble Sort
    // public static void bubbleSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j+1]>arr[j]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    // // Selection Sort
    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int maxPos = i; 
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]>arr[maxPos]){
    //                 maxPos = j;
    //             }
    //         }
    //         // swap
    //         int temp = arr[i];
    //         arr[i] = arr[maxPos];
    //         arr[maxPos] = temp;
    //     }
    // }
    // // Insertion Sort
    // public static void insertionSort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev>=0 && arr[prev]<curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1] = curr;
    //     }
    // }
    // // Counting Sort
    // public static void countingSort(int arr[]){
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         max = Math.max(max,arr[i]);
    //     }
    //     int count[] = new int[max+1];
    //     for(int i=0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }
    //     int j=0;
    //     for(int i=count.length-1;i>=0;i--){
    //         while(count[i]>0){
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }
    // Main Function
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
    }
}