import java.util.Scanner;

public class RemoveWordFromAString {
    private static String removeWord(String str,String word) {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(word)){
            return removeWord(str.substring(word.length()),word);
        }else{
             return str.charAt(0)+removeWord(str.substring(1),word);
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        String word= s.nextLine();
        System.out.println(removeWord(str, word));
    }
}
