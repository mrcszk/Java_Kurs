import  java.lang.Math;

public class Triangle extends Polygon {
    Triangle(int a, int b, int c){
        sides.add(a);
        sides.add(b);
        sides.add(c);

    }
    public double surface(){
        double p = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;

        return Math.sqrt(p * (p-sides.get(0)) * (p-sides.get(1)) * (p-sides.get(2)) );
    }
    public double perimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }
}
