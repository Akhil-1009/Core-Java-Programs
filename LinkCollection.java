// importing the package of linked list
import java.util.LinkedList;
public class LinkCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(0,100);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove();
        list.set(2,40);
        for(int i:list)
        {
            System.out.println(i);
        }
    }
}
