public class linkedlist {

    public static class Node {
        int data;
        Node next;

       public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        // step-1 create new node
        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2 - newNode next = head
        newNode.next = head; // link

        // step 3- head = newNode
        head = newNode;

    public static void main(String[] args) {
        
    }
}
