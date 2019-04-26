public class Main {
    public static void main(String[] args) {
        int i=0;
        String[] studentNames = { "Budynek Piotr",
                "Chalupa Krystyna",
                "Wiezowiec Jan",
                "Szkieletor Andrzej",
                "Domek Marianna" };

        String[]results = new String[studentNames.length];
        for(String person : studentNames ) {
            String[] splittedPerson = person.split(" ");

            String name = splittedPerson[1];
            String surname = splittedPerson[0];
            String login = name.substring(0,3) + surname.substring(0,2);
            String email = login.toLowerCase() + "@student.agh.edu.pl";
            results[i++] = email;
        }

        for(String x : results ) {
            System.out.println(x);            }
    }
}