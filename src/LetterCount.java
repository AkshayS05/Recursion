import java.util.*;

public class LetterCount {
    private static Object Set;

    private static void countLetters(String str) {
        int count=0;
        int k=0;
        int h=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            k++;
            int j;
            for (j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    if (str.charAt(i) == str.charAt(j)) {
                        count = count + 2;
                    }
                } else {
                    h=0;
                    h = j;
                    break;
                }
                if (count > 1) {
                    System.out.println(str.substring(i - k + 1, h));
                    return;
                }
            }
        }
            System.out.println(-1);
        }


    public static void main(String[] args) {
        String str= "Today, is the greatest day ever!";
        countLetters(str);
    }

}
