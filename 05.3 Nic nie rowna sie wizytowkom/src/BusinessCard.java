import java.util.ArrayList;

public class BusinessCard {

    private String name;

    private String surname;

    private int phone;

    private String city;

    private String output = "";
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

    public void print() {
        ArrayList<String> lines = getLines();

        int maxLength = getMaxLength(lines);

        String starsLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            starsLine += "*";
        }

        System.out.println(starsLine);

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = "*" + line + "*";

            System.out.println(line);
        }

        System.out.println(starsLine);
    }
    public String toString() {
        ArrayList<String> lines = getLines();

        int maxLength = getMaxLength(lines);

        String starsLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            starsLine += "*";
        }

        System.out.println(starsLine);

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = "*" + line + "*";

            output += line;
            output += "\n";
        }

        output += starsLine;
        output += "\n";
        return  output;
    }

    private int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;

        for (String line : lines) {
            int lineLength = line.length();

            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }

        return maxLength;
    }

    private ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(name + " " + surname);
        lines.add("tel. " + phone + " adres: " + city);

        return lines;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BusinessCard other = (BusinessCard) obj;

        if (name == null && other.name != null) {
            return false;
        } else if (!name.equals(other.name)) {
            return false;
        }

        if (surname == null && other.surname != null) {
            return false;
        } else if (!surname.equals(other.surname)) {
            return false;
        }

        if (city == null && other.city != null) {
            return false;
        } else if (!city.equals(other.city)) {
            return false;
        }

        if (phone != other.phone) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + phone;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }
    public static void main(String[] args) {
//        BusinessCard a = new BusinessCard ("Janusz","Kowalski");
//        BusinessCard b = new BusinessCard ("Janusz","Kowalski");
//        b.print();
//        if (a.equals(b)) {
//            System.out.println("Wartości takie same!");
//        } else {
//            System.out.println("Wartości różne!");
//        }
        BusinessCard bc = new BusinessCard("Piotr", "Budynek");
        System.out.println(bc);
    }



}