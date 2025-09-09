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
    static int  factorial(int n){
        if(n==1 || n==0 ){
            return 1;
        }
        return n * factorial((n-1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( factorial(n));
    }
}