package Recursion;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high) {
        //check if low < high
        if(low < high) {
            //Pick pivot → put it in correct place → sort left side → sort right side.
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high) {
        //pivot is always last element
        int pivot = arr[high]; //5 is pivot here
        int i = low - 1; // -1
        for(int j=low;j < high;j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }
    public static void main(String[] args) {
        // Quick Sort: Picks a pivot,puts elements smaller on one side,larger on other and sort both side recursively.
        int[] arr = {10,7,8,9,1,5};
        quickSort(arr,0,arr.length-1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
