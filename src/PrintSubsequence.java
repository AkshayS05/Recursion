import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintSubsequence {
    private static void printSubseq(String str) {
        printSubseq(str,"");
    }
    private static void printSubseq(String str,String ans) {
if(str.isEmpty()){
    System.out.println(ans);
    return;
}
char ch= str.charAt(0);
printSubseq(str.substring(1),ans+ch);
printSubseq(str.substring(1),ans);
    }
    private static ArrayList<String> returnSubseq(String str) {
return returnSubseq(str,"");
    }
        private static ArrayList<String> returnSubseq(String str, String ans) {
    if(str.isEmpty()){
        ArrayList<String> list= new ArrayList<>();
        list.add(ans);
        return list;
    }
    char ch= str.charAt(0);
    ArrayList<String> left= returnSubseq(str.substring(1),ans+ch);
    ArrayList<String> right= returnSubseq(str.substring(1), ans);
    left.addAll(right);
    return left;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = s.next();
//        printSubseq(str);
        System.out.println(returnSubseq(str));
    }
}
