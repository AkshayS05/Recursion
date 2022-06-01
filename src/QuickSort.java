import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    private static void quickSort(int[] arr) {
        //calling the helper function with additional function parameters low and high
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int start= low;
        int end= high;
        int mid= start+(end-low)/2;
        int pivot= arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp= arr[start];
                arr[start]= arr[end];
                arr[end]= temp;

                start++;
                end--;
            }
            //after this step the start will reach to a certain index as well as end too.
        }
        //we will call recursion on the 0 t the new end and keep checking the base condition
        // when base condition fails, it means the ist half of the array is sorted
        quickSort(arr,low,end);
        //then the recursion will be called on the second half where elements are bigger then pivot element but not sorted
        quickSort(arr,start,high);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements of the array to be sorted");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
