import org.w3c.dom.Node;

public class test{
    Node head;
    public int size;

    test(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
        
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head; 
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    //delete first
    public void deleteFirst(){
        size--;
        head =head.next;
    }

    //delete last
    public void deleteLast(){
        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next = null;
        
    }

    public int getSize(){
            return size;
        }
    public static void main(String[] args) {
        test list = new test();
        list.addFirst("Woafi");
        list.addFirst("Name: ");
       // list.addLast("Mohammad");
        list.printList();
        System.out.println(list.getSize());
    }
}