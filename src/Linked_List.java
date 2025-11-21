import org.w3c.dom.Node;

import java.util.Scanner;
/*
class Linked_List {
    Node head;
    private int size;

    Linked_List() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;  // ✅ Fixed
            size++;
        }
    }

    public void addFirst(String data) {  // ✅ Changed return type to void
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // ✅ Fixed assignment
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // ✅ Fixed
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {  // ✅ Fixed condition
            currNode = currNode.next;
        }
        currNode.next = newNode;  // ✅ Fixed assignment
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");  // ✅ Removed undefined variable
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List ll = new Linked_List();

        ll.addFirst("A");
        ll.addFirst("B");
        ll.addLast("C");

        System.out.println("Linked List:");
        ll.printList();  // Output: B->A->C->null
    }
}


class Linked_List {
    Node head;
    private int size;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                newNode = head;
            }
            newNode.next = head ;
            head= newNode;
            size++;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                newNode = head;
            }
            Node curr = head;
            while (curr != null) {
                System.out.println(curr.data + " ");
                curr = curr.next;
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Linked_List ll = new Linked_List();
            ll.addLast(3);
        }


}

 */
import java.util.*;

public class Linked_List {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(30);
        list.add(5);
        list.add(50);
        list.add(22);
        list.add(3,24);

        System.out.println("Before removeIf:");
        System.out.println(list);

        // REMOVE > 25 using Lambda
        list.removeIf(n -> n > 25);

        System.out.println("After removeIf (removed >25):");
        System.out.println(list);
    }
}
