import java.util.Scanner;

public class PrintFirstAndLastIndexOfChar {
    public static int first=0;
    public static int last= 0;
    private static void findFirstAndLast(String str, char c) {
        //Time complexity: O(n) as we traversed on the string from 0 to length one time
        findFirstAndLast(str,c, 0);
    }
    private static void findFirstAndLast(String str, char c, int index) {
        if(index==str.length()){
            System.out.print(first+" "+ last);
            return;
        }
        if(str.charAt(index)== c){
            if(first==0){
                first= index;
            }else{
                last= index;
            }
        }
        findFirstAndLast(str,c,index+1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = s.next();
        System.out.println("Please enter the character you want to find first and last index of");
        char c = s.next().charAt(0);
        findFirstAndLast(str, c);
    }
}
