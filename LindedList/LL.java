public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }// constructor of main class

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;  
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
    //addInMiddle
    public void addInMiddle(int index, String data){
        if(index > size || index < 0) {
           System.out.println("Invalid Index value");
           return;
       }
       size++;
       Node newNode = new Node(data);
       if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
        return;
    }
        Node currNode = head;
        for (int i=1; i<size; i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;

        head = head.next;
    }
    ////delete Last
     public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;   //head.next = null ->
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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

    public int getSize(){
        return size;
    }

    public void reverseIterate(){

        if (head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            //update
            prevNode = currNode;
            currNode = nextNode;


        }
        head.next = null;
        head = prevNode;

    } 

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        /*list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());*/

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addInMiddle(3, "2.5");
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }
} //main class
