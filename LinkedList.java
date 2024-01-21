public class LinkedList {
    public static int length(Node<Integer> head)
    {
        Node<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String args[])
    {
    Node<Integer> n1=new Node<>(10);
    Node<Integer> n2=new Node<>(20);
    Node<Integer> n3=new Node<>(30);
    Node<Integer> n4=new Node<>(40);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    Node<Integer> temp=n1;
    while(temp!=null)
    {
        System.out.println("the data is "+temp.data);
        temp=temp.next;
    }
    System.out.println(length(n1));
    }


}
