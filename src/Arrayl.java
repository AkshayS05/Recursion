import java.util.*;
public class Arrayl {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "apple" );
        list.add( "banana" );
        list.add( "carrot" );
        list.add( 0, "mango" );
        System.out.println(list.get(2));
    }
}
