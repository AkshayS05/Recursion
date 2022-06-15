import java.util.Scanner;

public class FindNodeinLL {
    public static LinkedList<Integer> takeInput(){
        LinkedList<Integer> head=null,tail=null;
        Scanner s= new Scanner(System.in);
        int data= s.nextInt();

        while(data!=-1){
            LinkedList<Integer> newNode= new LinkedList<>(data);
            if(head==null){
                head=newNode;
                tail= newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }

    private static void print(LinkedList<Integer> head) {
        LinkedList<Integer> temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    private static int findNode(LinkedList<Integer> head, int num) {
        if(head==null){
            return -1;
        }
        if(head.data==num){
            return 0;
        }

        LinkedList<Integer> temp= head.next;
        int index=0;
        while(temp!=null &&temp.next!=null){
            if(temp.data!=num){
                temp=temp.next;
                index++;
            }else{
                return index;
            }
        }
        System.out.println("Sorry the element is not present, thus returning -1");
        return -1;
    }
    public static void main(String[] args) {
        LinkedList<Integer> head= takeInput();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the element you want to find index for");
        int num= s.nextInt();
       int index= findNode(head,num);
        System.out.println("The index of your element is:"+ index);
    }


}
