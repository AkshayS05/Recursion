import java.util.Scanner;

public class PrintSubsequences {
    //Time complexity- O(2^n)
    private static void printSubsequence(String str) {
        printSubsequence(str, 0, "");
    }

    private static void printSubsequence(String str, int i, String s) {
        if(i==str.length()){
            System.out.println(s);
                return;
        }
        printSubsequence(str, i+1, s+str.charAt(i));
        printSubsequence(str, i+1, s);
    }

    public static void main(String[] args) {
        System.out.println("Please enter the String");
        Scanner s= new Scanner(System.in);
        String str= s.next();
        printSubsequence(str);
    }


}
