import java.util.Scanner;

public class NoOfDiceRolls {
    private static void diceRolls(int target) {
        diceRolls(target,"");
    }
    private static void diceRolls(int target, String ans) {
        if(target==0){
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <=6 &&i<=target ; i++) {
            diceRolls(target-i, ans+i);
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the target");
        int target= s.nextInt();
        diceRolls(target);
    }


}
