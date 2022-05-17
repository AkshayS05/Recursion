import java.util.Scanner;

public class MoveAllXtoTheEnd {
    private static void moveXToEnd(String word) {
        moveXToEnd(word,0,"");
    }
    public static int count=0;
    private static void moveXToEnd(String word, int i,String str) {
        //Time complexity of this code: we have traversed the whole string one time which is n and
        //then count times we traversed to add x at last which is count or ir can also be n in case all are x
        //thus time complexity is O(2n)--> ignoring constants O(n)
        if(i==word.length()-1){
            for (int j = 0; j <count ; j++) {
                str+="x";
            }
            System.out.println(str);
            return;
        }
        if(word.charAt(i)!='x'){
            str+=word.charAt(i);
            moveXToEnd(word,i+1,str);
        }else{
            count++;
            moveXToEnd(word,i+1,str);
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter the String");
        Scanner s= new Scanner(System.in);
        String word= s.next();
  moveXToEnd(word);
    }
}
