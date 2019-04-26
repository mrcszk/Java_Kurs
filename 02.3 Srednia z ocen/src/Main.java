import java.util.Scanner;

public class Main {
    public static double average(int[] marks) {
        int sum = 0;

        for(int i=0; i<marks.length; i++) {
            sum += marks[i];
        }

        return sum/(double)marks.length;
    }
    public static double max(int[] marks) {
        int max = marks[0];

        for(int i=0; i<marks.length; i++) {
            if (marks[i]>max)
                max=marks[i];
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.print("Podaj liczbę ocen: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] grades = new int[number];
        System.out.print("Podaj oceny: ");

        for(int i=0;i<number;i++)
            grades[i] = scanner.nextInt();
        System.out.println();
        System.out.println("Twoja średnia: "+ average(grades));
        System.out.println("Największa ocena: "+ max(grades));

    }
}
