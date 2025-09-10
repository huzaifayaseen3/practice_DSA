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
     */

        static int pow(int p , int q ){
            if(q == 0){
                return 1 ;
            }
            return pow(p,q-1) * p ;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.println("Enter pth Term : ");
        int p = sc.nextInt();
        System.out.println("Enter qth Term : ");
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
}