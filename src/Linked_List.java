import java.util.ArrayList;

public class Linked_List {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>() ;
        array.add(3);
        array .addFirst(44);
        if(array.contains(3) == true){
            System.out.println("Number is present ");
        }
        System.out.println(array);
    }

}
