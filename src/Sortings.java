//import java.util.Arrays;
//import java.util.Scanner;

/*
public class Main {*/
    /*
    (   Recursion Basics (A function repeating it-self  ) )
public static  void printIncreasing(int n){
    if(n == 1){
        System.out.println(n);
        return   ;
    }
    printIncreasing(n-1);
    System.out.println(n);

}


    public static  void printIncreasing(int n){
        System.out.println(n);
if(n == 1){
    System.out.println(n);
    return   ;
}
printIncreasing(n-1);
  //  System.out.println(n);
    }
    printIncreasing(n);
    System.out.print("Enter  N : " );
    int n = sc.nextInt();

    Finding      Factorial
     */
   /*
    static int  factorial(int n){
        if(n==1 || n==0 ){
            return 1;
        }
        return n * factorial((n-1));

    }

    */
    /*
    static int  Fabonacci(int n)
    {
        if(n==1 || n==0 ){
            return 1;
        }
        int prev = Fabonacci(n-1);
        int prevPrev = Fabonacci(n-2);

        return n = prev + prevPrev ;

    }
        System.out.println( Fabonacci(n));

     */
    /*
    static int sumOfDigits(int n){
        if (n > 0 && n <= 9) {
            return n;
        }
            return sumOfDigits(n / 10) + n % 10;
    }

        System.out.println(sumOfDigits(n));
        public class ReverseStringRecursion {

    static String reverse(String str) {
        // base case: if string is empty or length 1
        if (str.isEmpty()) {
            return str;
        }
        // take first character, reverse rest, and put char at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reverse(word));
    }
}

     */
    /*

        static int pow(int p , int q ){
            if(q == 0){
                return 1 ;
            }
            return pow(p,q-1) * p ;
        }

        int n = sc.nextInt();
        System.out.println("Enter pth Term : ");
        int p = sc.nextInt();
        System.out.println("Enter qth Term : ");
        int q = sc.nextInt();
        int max = a[0];
        for(int i : a){
            if(i > max){
                max = i ;
            }
        }
        System.out.println(pow(p,q));

         Bubble sort */
    /*
    static void bubbleSort(int [] a){
        int n = a.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j =0 ; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j] ;
                    a[j] = a[j+1];
                    a[j+1] = temp ;
                }
            }
        }
    }

        int [] arr = new int [] {2,8,6,5,9} ;
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int [] a = {2,8,6,5,9} ;
        bubbleSort(a);
        for(int i : a){
            System.out.println(i + " ");
       Selection Sort */
    /*
    static void selectionSort(int [] a ){
        int n = a.length ;
        for(int i = 0 ; i < n-1 ; i++){
            int smallestNum = i ;
            for(int j = i+1 ; j < n ; j++){
                if(a[j] < a[smallestNum]){
                    smallestNum = j;
                }
            }
        int temp = a[i] ;
            a[i] = a[smallestNum];
            a[smallestNum] = temp ;
        }
    }

        selectionSort(a);
     */
    /*
    1. Adding elements

add(E e) → add at end

add(int index, E element) → add at specific position

addFirst(E e) → add at beginning

addLast(E e) → add at end (same as add)

offer(E e) → add at end (queue style)

offerFirst(E e) → add at beginning

offerLast(E e) → add at end

2. Removing elements

remove() → remove first element

remove(int index) → remove element at index

remove(Object o) → remove by value

removeFirst() → remove first element

removeLast() → remove last element

poll() → remove first element (queue style)

pollFirst() → remove first element

pollLast() → remove last element

clear() → remove all elements

3. Accessing elements

get(int index) → get by index

getFirst() → get first element

getLast() → get last element

peek() → see first element (no remove)

peekFirst() → same as peek()

peekLast() → see last element

4. Searching

contains(Object o) → check if value exists

indexOf(Object o) → first index of value

lastIndexOf(Object o) → last index of value

5. Size and utility

size() → number of elements

isEmpty() → check if list is empty

toArray() → convert to array

iterator() → loop with iterator

descendingIterator() → loop in reverse

      int [] a ={2,5,6,96,78};
        int sum =0 ;
        for(int i : a){
            sum += i ;
        }
        System.out.println(max);
        System.out.println(sum);
        for(int i : a){
            System.out.println(i + " ");
        }
     */
/* Linked list Starts */
/*
    public static class Node{
        int data ;
        Node next ;

        public Node(int data ) {
            this.next = null;
            this.data =data;
        }
    }
    // using recursion
    public static void  displayrecursion(Node a ){
        if(a== null) return;
        displayrecursion(a.next);
        System.out.println(a.data +" ");
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Node a = new Node (5) ;
        Node b = new Node (4) ;
        Node c = new Node (6) ;
        Node d = new Node (7) ;
        Node e = new Node (2) ;

        // 5 4 6 7 2
        a.next = b ; // 5->4 6 7 2
        b.next = c ; // 5->4->6 7 2
        c.next = d ; // 5->4->6->7 2
        d.next = e ; // 5->4->6->7->2
       // Node temp = a ;
//        while(temp != null ){
//            System.out.println(temp.data + " ");
//            temp= temp.next;
//
//
        display recursion(a);



        }
}

*//*
    
        public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<>();
            ll.add(10);
            ll.add(20);
            ll.add(15);
            System.out.println(ll.get(1));
             int a = ll.set(1,4);
            System.out.println(a);
            System.out.println(ll.size() );



        }
    }
     // st.pop(); // removes the last element on stack ;
              //  System.out.println(st.peek()); //just see which element is on top (but don’t remove it).
               // System.out.println(st);
    */

/* stack Started */
//        public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                Stack<Integer> st = new Stack<>();   // create a stack named 'st'
//                st.push(2);                          // stack: [2]
//                st.push(3);                          // stack: [2, 3]
//                st.push(4);                          // stack: [2, 3, 4]
//                System.out.println(st);              // prints [2, 3, 4]
//
//                int idx = 1;                         // position where we want to insert
//                int x = 12;                          // new element to insert (12)
//
//                Stack<Integer> temp = new Stack<>(); // temporary stack
//
//                // ----------- LOOP 1 ----------------
//                while(st.size() > idx){              // while size of st is > 1
//                    temp.push(st.pop());             // move elements from st -> temp
//                }
//
//                st.push(x);                          // push 12 into st
//                System.out.println(st);              // print st after inserting 12
//
//                // ----------- LOOP 2 ----------------
//                while(temp.size() > 0){              // while temp is not empty
//                    st.push(temp.pop());             // move back elements from temp -> st
//                }
//
//                System.out.println(st);              // final stack
//                System.out.println("Enter a number :");
//                int sum = 0 ;
//                int n =sc.nextInt();
//                int [] arr = new int[n];
//                for(int i = 0 ; i < n ;i++){
//                     arr[i]= sc.nextInt();
//
//                }
//                for (int i = 0 ; i< n ; i++) {
//                   sum += arr[i];
//                }
//                System.out.println(sum);
//            }
//            Stack<Integer> stack = new Stack<>();
//            stack.push(1);
//            }
//        }
//class Main{
//            public static void main(String[] args) {
//                int[] arr = new int[] {13, 34, 5, 6, 7};
//                System.out.println(arr[3 ]);
//                    for( int i:arr){
//                        System.out.print(i +" ");
//                    }
//                System.out.println();
//                        for(int i = arr.length-1; i>=0 ; i--){
//                            System.out.pri;nt(arr[i] +" ");
//                        }
//            }
//        }
/*
write a java program that create linked list by taking user input and then
print them also Delete Nodes Greater Than 25,Search an Element in Linked List,i want linked list to print in ->
tis fashion you can you built in function
 */
/*
Fantastic Code
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // -------------------------------
        // 1. Create Linked List from User
        // -------------------------------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int val = sc.nextInt();
            list.add(val);   // built-in add
        }

        // Print list initially
        System.out.println("\nOriginal LinkedList:");
        printList(list);

        // -----------------------------------
        // 2. Delete elements greater than 25
        // -----------------------------------
        list.removeIf(x -> x > 25);   // built-in

        System.out.println("\nLinkedList after deleting elements > 25:");
        printList(list);

        // ----------------------------
        // 3. Search for an element
        // ----------------------------
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        if (list.contains(key)) {   // built-in
            System.out.println(key + " found in the LinkedList.");
        } else {
            System.out.println(key + " NOT found in the LinkedList.");
        }
    }

    // ----------------------------
    // Function to print like 3->5->4
    // ----------------------------
    public static void printList(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}




import java.util.Scanner;

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

 */
/*
Selection sorting

 */
/*
public class Sortings {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = current;
        }

    }


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] data = {77, 32, 33, 22, 11, 10};
        System.out.println("\nSelection sort : ");
        selectionSort(data);
        for (int item : data) {
            System.out.print(item + " ");
        }
        System.out.println("\nBubble sort : ");
        bubbleSort(data);
        for (int item : data) {
            System.out.print(item + " ");

        }
        System.out.println("\nInsertion sort : ");
        insertionSort(data);
        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}

 */