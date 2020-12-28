


public class LinkedList {


    static class Node{
        int data;
        Node next;

        public Node(int d){
            this.data =d;
            next = null;
        }

    }
    static Node head;

   public static Node reverseLinkedList(Node node){
        Node previous = null;
        Node current = node;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next= previous;
            current = next;
        }
        node = previous;
        return node;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }



    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.head = new Node(3);
       list.head.next = new Node(8);
       list.head.next = new Node (5);
       list.head.next = new Node(2);

        System.out.print("Current linked list = " );
        list.printList(head);
        System.out.println("\n");
       head = list.reverseLinkedList(head);
        System.out.println("LinkedList after reversing = " );
        list.printList(head);


    }

}