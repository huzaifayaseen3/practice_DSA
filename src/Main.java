import java.util.Scanner;
public class Main {
    /*
public static  void printIncreasing(int n){
    if(n == 1){
        System.out.println(n);
        return   ;
    }
    printIncreasing(n-1);
    System.out.println(n);

}

     */
    public static  void printIncreasing(int n){
        System.out.println(n);
        if(n == 1){
            System.out.println(n);
            return   ;
        }
        printIncreasing(n-1);
        //  System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  N : " );
        int n = sc.nextInt();

        printIncreasing(n);
    }
}