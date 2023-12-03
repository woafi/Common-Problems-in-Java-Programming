public class LL {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add - first

    public void addFirst(String data){
        Node newNode =new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add - last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    //print
    public void printList(){

        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }

        System.out.println("NULL");

    }


    public static void main(String[] args) {
        LL list =new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("Sample");
        list.printList();
    }
}
