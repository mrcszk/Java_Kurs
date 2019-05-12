import java.util.ArrayList;

public class Orchestra implements Instrument {
    private ArrayList<Instrument> list = new ArrayList<>();
    public void play() {
        for(Instrument x: list)
            x.play();
    }
    private void addInstrument(Instrument instrument) {
        this.list.add(instrument);
    }
    public static void main(String[] args) {
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Trombone trombone = new Trombone();
        Orchestra orchestra = new Orchestra();

        orchestra.addInstrument(flute);
        orchestra.addInstrument(guitar);
        orchestra.addInstrument(trombone);
        orchestra.play();
    }

}