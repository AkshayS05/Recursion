import java.util.Scanner;

public class FindLastIndexOfNum {
    private static int findLastIndex(int[] arr, int num) {
        return findLastIndex(arr,num,0,-1);
    }

    private static int findLastIndex(int[] arr, int num, int i, int elem) {
        //if i reached here, it means the number we are looking for doesn't
        //exist in the array
        if(i==arr.length){
            return elem;
        }
        if(arr[i]==num) {
            elem = i;
        }
       return findLastIndex(arr,num,i+1, elem);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number you want to find last index of");
        int num= s.nextInt();
        System.out.println(findLastIndex(arr,num));
    }
}

