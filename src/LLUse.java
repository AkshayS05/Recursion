import java.util.Scanner;

public class LLUse {
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
//                LinkedList<Integer> temp= head;
//                while(temp.next!=null){
//                    temp=temp.next;
//                }
//                temp.next=newNode;
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
    public static void increment(LinkedList<Integer> head){
        LinkedList<Integer> temp= head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
    public static LinkedList<Integer> deleteNode(LinkedList<Integer>head, int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
           head=head.next;
           return head;
        }
        LinkedList<Integer> temp= head;
        int count=0;
        while(temp!=null&&count<(pos-1)){
            temp=temp.next;
            count++;
        }
        if(temp==null||temp.next==null){
            System.out.println("Sorry, the pos is greater than the length of the linked list");
            return head;
        }
        temp.next=temp.next.next;

        return head;
    }
    public static void main(String[] args) {
        System.out.println("Enter -1 to stop");
   LinkedList<Integer>head=takeInput();
   Scanner s= new Scanner(System.in);
        System.out.println("Enter the index you want to delete");
        int pos= s.nextInt();
        LinkedList<Integer>newHead= deleteNode(head, pos);
        print(newHead);
    }
}
