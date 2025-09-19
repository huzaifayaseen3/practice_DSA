//import java.util.Arrays;
//import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
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
        Node temp = a ;
//        while(temp != null ){
//            System.out.println(temp.data + " ");
//            temp= temp.next;
//
//        }
        displayrecursion(a);


        }
}

     */


        public static void main(String[] args) {

            // The Deque interface provides stack-like methods (push, pop, peek)
            // ArrayDeque is an efficient implementation of Deque
            Deque<String> stack = new ArrayDeque<>();

            // 1. push() operation: Adding elements to the top
            System.out.println("Pushing elements onto the stack:");
            stack.push("Plate 1");
            stack.push("Plate 2");
            stack.push("Plate 3");
            System.out.println("Current stack: " + stack); // [Plate 3, Plate 2, Plate 1]

            System.out.println("-----------------------------------");

            // 2. peek() operation: Viewing the top element without removing it
            String topPlate = stack.peek();
            System.out.println("Top element (peek): " + topPlate); // Plate 3
            System.out.println("Stack after peek: " + stack); // [Plate 3, Plate 2, Plate 1]

            System.out.println("-----------------------------------");

            // 3. pop() operation: Removing the top element
            String removedPlate = stack.pop();
            System.out.println("Removed element (pop): " + removedPlate); // Plate 3
            System.out.println("Stack after pop: " + stack); // [Plate 2, Plate 1]

            System.out.println("-----------------------------------");

            // 4. isEmpty() operation: Checking if the stack is empty
            System.out.println("Is the stack empty? " + stack.isEmpty()); // false

            System.out.println("-----------------------------------");

            // Pop all remaining elements
            System.out.println("Popping all remaining elements:");
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }

            System.out.println("Is the stack empty now? " + stack.isEmpty());
            System.out.println();// true
        }
    }
