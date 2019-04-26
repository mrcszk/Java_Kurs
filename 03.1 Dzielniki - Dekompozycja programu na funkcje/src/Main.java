import javax.crypto.NullCipher;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        return scanner.nextInt();

    }
    public static  int[] findDividers(int x) {
        int[] dividers = new int[x/2];
        int j =0;
        for(int i=2;i<= x/2 ; i++) {
            if(checkDivider(x, i)){
                dividers[j]=i;
                j++;
            }
        }

        int[] finalDividers  = Arrays.copyOf(dividers,j);
        return finalDividers;
    }

    public static boolean checkDivider(int a, int b) {
        return a % b == 0;
    }



    public static void printDivide(int[] dividers) {

        if(dividers.length >0){
            System.out.print("Dzielniki: ");
        for(int divider:dividers) {
            System.out.print(divider + " ");
        }}
        else
            System.out.print("Brak dzielników.");

    }
    public static void main(String[] args) {
        printDivide(findDividers(readNumber()));
    }
}
