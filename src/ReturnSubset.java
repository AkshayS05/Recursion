import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubset {
    private static ArrayList<String> returnSubset(String str) {
        return returnSubset(str,"");
    }
    private static  ArrayList<String> returnSubset(String str, String ans) {
        if(str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch= str.charAt(0);
        ArrayList<String> left= returnSubset(str.substring(1),ans+ch);
        ArrayList<String> right= returnSubset(str.substring(1),ans);
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
        System.out.println(returnSubset(str));
        }
}

