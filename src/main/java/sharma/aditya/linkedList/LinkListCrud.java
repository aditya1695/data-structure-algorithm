package sharma.aditya.linkedList;


public class LinkListCrud {

    public static void main(String[] args) {
        Node head = createHead(5);
        insertAtEnd(15, head);
        printLinkedList(head);
        head = insertAtBeginning(75, head);
        printLinkedList(head);
    }

    private static Node createHead(int data) {
        return new Node(data);
    }

    private static Node insertAtPosition(int data, int position, Node head) {
        if (position < 1) return head;
        if (position == 1) {
            Node newHead = new Node(data);
            newHead.next = head;
            return newHead;
        }
        Node temp = head;
        for(int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        if(temp == null) return head;
        temp.next = newNode;
        newNode.next = temp;
        return head;
    }
    private static void insertAtEnd(int data, Node head) {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        System.out.println(data+ " Added successfully at the end.. .");
    }

    private static Node insertAtBeginning(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        System.out.println("\n"+data + " Added at the beginning.. .");
        return newNode;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

}
