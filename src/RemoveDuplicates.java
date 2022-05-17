import java.util.Scanner;

public class RemoveDuplicates {
    public static boolean[] map= new boolean [26];
    private static void removeDuplicates(String word) {
        removeDuplicates(word,0,"");
    }
//time complexity= O(n)
    private static void removeDuplicates(String word, int i, String s) {
        if(i==word.length()-1){
            System.out.print(s);
            return;
        }
        //to get the index of the character
        //if for example we have a at str.chart(index), then 'a'-'a'=0, if we have already encountered a
        //during any previous iterations, we already have a true there, thus we won;t add it in our string
        //and call the next index.
        if (map[word.charAt(i)-'a']) {
            removeDuplicates(word, i + 1, s);
        }else{
            s+=word.charAt(i);
            map[word.charAt(i)-'a']=true;
            removeDuplicates(word,i+1, s);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the String");
        Scanner s= new Scanner(System.in);
        String word= s.next();
        removeDuplicates(word);
    }
}
