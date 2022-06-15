import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class PrintUniqueSubsequences {
    private static void printUniqueSubsequence(String str) {
        HashSet<String> set= new HashSet<>();
        printUniqueSubsequence(str,0,"",set );
    }

    private static void printUniqueSubsequence(String str, int i, String s, HashSet<String> set) {
        if(i==str.length()){
            if(set.contains(s)){
                return;
            }else{
                set.add(s);
                System.out.println(s);
                return;
            }
        }
        printUniqueSubsequence(str,i+1,s+str.charAt(i), set);
        printUniqueSubsequence(str,i+1,s, set);
    }

    public static void main(String[] args) {
        System.out.println("Please enter the String");
        Scanner s= new Scanner(System.in);
        String str= s.next();
        printUniqueSubsequence(str);
    }


}
