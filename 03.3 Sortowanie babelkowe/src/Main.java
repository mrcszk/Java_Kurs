public class Main {
    public static void printNumbers(int [] numbers) {
        for(int x: numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static boolean isGreaterThan (int [] numbers, int x, int y) {
        return numbers[x] > numbers[y];
    }

    public static void swap (int [] numbers, int x, int y) {
        int temp;
        temp = numbers[y];
        numbers[y] = numbers[x];
        numbers[x] = temp;
    }

    public static void sort (int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (isGreaterThan(numbers,j,j+1)) {
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 2, 0, 2, 10, 1, 9, 12, 3, 5 };
        printNumbers(numbers);
        sort(numbers);
        printNumbers(numbers);
    }
}