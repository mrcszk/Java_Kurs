import java.util.ArrayList;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        HashSet<String> myList2 = new HashSet<>();
        String[] names = new String[]{"Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala"};
        for(String x:names) {
            myList.add(x);
            myList2.add(x);
        }
        for(String x:myList) {
            System.out.print(x +" ");
        }
        System.out.println();
        myList.remove("Basia");
        myList2.remove("Basia");
        for(String x:myList) {
            System.out.print(x +" ");
        }
        System.out.println();
        for(String x:myList2) {
            System.out.print(x +" ");
        }
        System.out.println();
        System.out.println(myList.get(2));
        if(myList.contains("Ola")) {}
    }}