public abstract class Rectangle extends Polygon {
    Rectangle(int a, int b){
        sides.add(a);
        sides.add(b);
    }
    Rectangle(int a){
        sides.add(a);
    }

    public double surface(){
        return 2*sides.get(0) + 2*sides.get(1);
    }
    public double perimeter(){
        return sides.get(0)*sides.get(1);
    }
}
