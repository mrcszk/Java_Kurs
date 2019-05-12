public class Square extends Rectangle {
    Square (int a){
        sides.add(a);
    }
    public double surface(){
        return 4*sides.get(0);
    }
    public double perimeter(){
        return sides.get(0)*sides.get(0);
    }
}
