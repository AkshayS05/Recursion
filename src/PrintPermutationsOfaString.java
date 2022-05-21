import java.util.Scanner;

public class PrintPermutationsOfaString {
    //Time Complexity O(n!)
    private static void printPermutations(String str) {
        printPermutations(str,"");
    }

    private static void printPermutations(String str, String perms) {
        if(str.length()==0){
            System.out.println(perms);
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            char currChar= str.charAt(i);
             String newStr= str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr, perms+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = s.next();
        printPermutations(str);
    }
}
