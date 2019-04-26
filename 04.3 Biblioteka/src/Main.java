import java.util.HashMap;
import java.util.ArrayList;

public class Main{
    private static String[] BOOKS = {"Priests Of Dawn",
            "Chicken Abroad",
            "Lord With Sins",
            "Chicken Abroad",
            "Fish And Horses",
            "Mistress Of Devotion",
            "Bandit Of The Void",
            "Lord With Sins",
            "Guardians And Gangsters",
            "Lions Of Dread",
            "Chicken Abroad",
            "Future Of Fire",
            "Priests Of Dawn",
            "Fish And Horses",
            "Chicken Abroad",
            "Fish And Horses",
            "Guardians And Gangsters",
            "Inception Of Heaven",
            "Lord With Sins",
            "Future Of Fire",
            "Driving Into The Depths",
            "Starting The Demons",
            "Maid With Blue Eyes",
            "Mistress Of Devotion",
            "Lovers In The Forest",
            "Fish And Horses",
            "Maid With Blue Eyes",
            "Destruction Of The Faceless Ones",
            "Guardians And Gangsters",
            "Chicken Abroad"};

    public static HashMap<String, Integer> createBooksCounter() {
        HashMap<String, Integer> counter = new HashMap<>();

        for (String book: BOOKS) {
            countBook(counter, book);
        }
        return counter;
    }

    public static void countBook(HashMap<String, Integer> booksCounter, String book) {
        if (!booksCounter.containsKey(book)) {
            booksCounter.put(book,  1);
        }
        else {
            int count = booksCounter.get(book);
            booksCounter.put(book,  count + 1);
        }
    }


    public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
        ArrayList<String> whiteRavens  = new ArrayList<String>();
        for (HashMap.Entry<String, Integer>entry: booksCounter.entrySet() ) {
            if(entry.getValue() == 1){
                whiteRavens.add(entry.getKey());
            }
        }
        return whiteRavens;
    }

    public static void printWhiteRavens(ArrayList<String> whiteRavens) {
        for (String x: whiteRavens){
            System.out.println(x);

        }
    }
    public static void main(String []args) {
        HashMap<String, Integer> booksCounter = createBooksCounter();
        ArrayList<String> WhiteRavens = findWhiteRavens(booksCounter);
        printWhiteRavens(WhiteRavens);
    }
}