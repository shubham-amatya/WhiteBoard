import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class CountNodes {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(10);

        Iterator iterator = linkedList.iterator();

        int count = 0;

        while(iterator.hasNext()){
            iterator.next();
            count++;
        }
        System.out.println(count);

    }







}
