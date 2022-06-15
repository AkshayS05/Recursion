import java.util.Scanner;

public class PrintKeypad {
    private static void printKeypad(String str) {
        printKeypad(str,"");
    }

    private static void printKeypad(String str, String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        int firstDigit= str.charAt(0) -'0';

        for (int i = (firstDigit-1)*3; i <firstDigit*3 ; i++) {
                    char charTobeAddded= (char) ('a'+ i);
                    printKeypad(str.substring(1),ans+charTobeAddded);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the numbers");
        String str = s.next();

        printKeypad(str);
    }
}
