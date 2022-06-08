import java.util.Scanner;

public class PrintSubset {
    private static void printSubset(String str) {
      printSubset(str, "");
    }

    private static void printSubset(String str, String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch= str.charAt(0);
        printSubset(str.substring(1), ans+ch);
        printSubset(str.substring(1),ans);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printSubset(str);
    }

}
