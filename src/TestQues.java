import java.util.Scanner;

public class TestQues {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr;
    }
    private static int solutions(int[] arr) {
        return solutions(sort(arr),0,1);

//  int sortedArray[]=sort(arr);
//  int num=1;
//  if(i==arr.length){
//      return Integer.MAX_VALUE;
//  }
//        for (int i = 0; i <sortedArray.length ; i++) {
//            if(sortedArray[i]==num){
//                num+=1;
//            }
//        }
//        return num;
    }
    private static int solutions(int[] arr, int i,int num) {
        int sortedArray[] = sort(arr);
        if (i == arr.length) {
            return num;
        }
        if(arr[i]==num||arr[i]<num){
            num+=1;
        }
        if(arr[i]>num){
            num-=1;
        }
      return solutions(arr,i+1,num);
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        private static int solution(int[] arr) {
        return solution(arr,1, 1);
    }

    private static int solution(int[] arr, int i, int j) {
        if(arr[i]<0){
            return 1;
        }
        if(i==arr.length){
            return 1;
        }
        int num=j ;
        if(arr[i-1]<num &&arr[i]>num){
            return num;
        }
        return solution(arr,i+1, j+1);
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
        System.out.println(solutions(arr));
    }


}
