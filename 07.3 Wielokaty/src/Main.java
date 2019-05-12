public class Main {

    public static void main(String[] args) {
        Triangle trojkat = new Triangle(3,4,5);
        Rectangle prosto = new Rectangle(3,4);
        System.out.println(trojkat.surface());
        System.out.println(trojkat.perimeter());
        System.out.println(prosto.surface());
        System.out.println(prosto.perimeter());
    }
}
