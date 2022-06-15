import java.util.Scanner;

public class countCharacters {
    private static int countWords(String str) {
        if(str.isEmpty()){
            return 0;
        }
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ') {
               count++;
            }
        }
        return count;
    }
    public static int countWordRec(String str){
        if(str.isEmpty()){
            return 0;
        }
        char ch= str.charAt(0);
        int count=0;
        if(ch==' ') {
            count+=countWordRec(str.substring(1));
        }else{
            count = 1 + countWordRec(str.substring(1));
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the string");
        String str= s.nextLine();
        System.out.println(countWordRec(str));
    }
}
