public class LinkedList<T> {
    T data;
    LinkedList<T> next; // to store the reference of the next node

    LinkedList( T data){
        this.data= data;
        next= null;
    }
}
