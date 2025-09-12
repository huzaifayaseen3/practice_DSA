import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*
    (   Recursion Basics (A function repeating it-self  )
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

         Bubble sort */
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
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
//        System.out.println("Enter pth Term : ");
//        int p = sc.nextInt();
//        System.out.println("Enter qth Term : ");
//        int q = sc.nextInt();
//        System.out.println(pow(p,q));
//        int [] arr = new int [] {2,8,6,5,9} ;
//       bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        int [] a = {2,8,6,5,9} ;
        bubbleSort(a);
        for(int i : a){
            System.out.println(i + " ");
        }
    }
}