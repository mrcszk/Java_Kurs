package sample;

public class HSVColor implements Comparable< HSVColor >{
    int hue;
    double saturation;
    double value;

    public HSVColor(int hue,double saturation, double value) throws ColorFormatException{

        if(hue<=0 || hue>= 360 || saturation<=0 || saturation >=1 || value >=1 || value <=0) {
            throw new ColorFormatException();
        }
        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
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