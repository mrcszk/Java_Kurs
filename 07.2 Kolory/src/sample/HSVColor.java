package sample;

public class HSVColor implements Comparable< HSVColor >{
    int hue;
    double saturation;
    double value;

    public HSVColor(int hue,double d, double e){
        this.hue = hue;
        this.saturation = d;
        this.value = e;
    }

    public int getHue() {
        return this.hue;
    }
    public double getSaturation() {
        return this.saturation;
    }
    public double getValue() {
        return this.value;
    }
	@Override
	public int compareTo(HSVColor otherColour) {
        return(this.hue - otherColour.hue);
	}
}