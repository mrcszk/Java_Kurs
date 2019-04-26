import java.util.ArrayList;

public class BusinessCard {
    private static final char BORDER = '*';
    protected String name;

    protected String surname;

    protected int phone;

    protected String city;

    public BusinessCard(String name, String surname, int phone, String city) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.city = city;
    }

    public BusinessCard(String name, String surname) {
        this(name, surname, 123456, "Krakow");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getBorder() {
        return BORDER;
    }

    public void print() {
        ArrayList<String> lines = getLines();

        int maxLength = getMaxLength(lines);

        String starsLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            starsLine += getBorder();
        }

        System.out.println(starsLine);

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = getBorder() + line + getBorder();

            System.out.println(line);
        }

        System.out.println(starsLine);
    }

    protected int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;

        for (String line : lines) {
            int lineLength = line.length();

            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }

        return maxLength;
    }

    protected ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(name + " " + surname);
        lines.add("tel. " + phone + " adres: " + city);

        return lines;
    }

}

