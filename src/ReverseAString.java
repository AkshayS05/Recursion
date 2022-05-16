import java.util.Scanner;

public class ReverseAString {
    private static void reverseString(String str) {
        reverseString(str,str.length()-1);
    }

    private static void reverseString(String str, int index) {
        if(index<0){
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str,index-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the String to reverse");
       String str = s.next();
       reverseString(str);
    }
}
