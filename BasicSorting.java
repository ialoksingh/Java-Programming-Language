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
    // Main Function
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArray(arr);
    }
}