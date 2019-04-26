import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            String star = "* ";
            String stars = "";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj imie ");
            String name = scanner.next();
            System.out.print("Podaj nazwisko ");
            String surname = scanner.next();
            System.out.print("Podaj tel ");
            String tel = scanner.next();
            System.out.print("Podaj adres ");
            String city = scanner.next();


            int how,tmp,i=0;

            String firstLine = star + name + " " + surname ;
            String secondLine = star + tel + " " + city;
            if(firstLine.length() > secondLine.length() ){
                how =  firstLine.length();
                tmp=firstLine.length()-secondLine.length();
                for(i=0;i<tmp;i++){
                    secondLine = secondLine + ' ';}
                firstLine += " *";
                secondLine += " *";
            }
            else {
                how = secondLine.length();
                tmp=secondLine.length()-firstLine.length();
                for(i=0;i<tmp;i++)
                    firstLine += ' ';
                firstLine += " *";
                secondLine += " *";
            }
            // how = Math.max(firstLine.length(),secondLine.length());


            for(i=0;i<how+2;i++)
                stars = stars + "*";
            System.out.println(stars);
            System.out.println(firstLine);
            System.out.println(secondLine);
            System.out.println(stars);

        }

}
