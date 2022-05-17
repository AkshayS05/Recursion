import java.util.Scanner;

//Time complexity for this code: O(n)
public class CheckIncreasingArray {
    private static boolean checkSorted(int[] arr) {
       return checkSorted(arr, 0);
    }

    private static boolean checkSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        //in case two consecutive elements are equal, we will consider that as a false case. i.e
        // array is not increasing
        if (arr[index] >= arr[index + 1]) {
           return false;
        }
           return checkSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements");
        for (int i = 0; i <size; i++) {
                arr[i]= s.nextInt();
        }
        System.out.println(checkSorted(arr));
    }
}
