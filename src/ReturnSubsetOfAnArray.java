import java.util.ArrayList;
import java.util.List;
public class ReturnSubsetOfAnArray {
    private static ArrayList<ArrayList<Integer>> returnSubset(int[] arr) {

   ArrayList<ArrayList<Integer>>outer= new ArrayList<>();
   outer.add(new ArrayList<Integer>());
   for(int num:arr){
       int n= outer.size();
       for (int i = 0; i <n ; i++) {
           ArrayList<Integer> internal= new ArrayList<>(outer.get(i));

           internal.add(num);
           outer.add(internal);
       }
    }
    return outer;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
       ArrayList<ArrayList<Integer>> ans= returnSubset(arr);
        for(ArrayList<Integer> list: ans){
            System.out.println(list);
        }
    }


}
