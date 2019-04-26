import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i,n=0;
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> winning = new ArrayList<>();
        for(i=1;i<50;i++) {
            numbers.add(i);
        }
        winning.add(5);
        winning.add(15);
        winning.add(32);
        winning.add(39);
        winning.add(43);
        winning.add(48);
        while(winning != results) {
            n++;
            results.clear();
            for (i = 1; i < 7; i++) {
                int position = random.nextInt(numbers.size());
                int winningNumber = numbers.get(position);
                results.add(winningNumber);
                numbers.remove(position);
            }
            // 1 sposób sortowania
            Collections.sort(results);
            //2 sposób sortowania
            results.sort(Comparator.naturalOrder());
            System.out.print(n + ". ");
            for(Integer x:results) {
                System.out.print(x + " ");
            }
            System.out.println();
            numbers.clear();
            for(i=1;i<50;i++) {
                numbers.add(i);
            }
        }
        System.out.println(n);

        for(Integer x:results) {
            System.out.print(x + " ");
        }
    }
}