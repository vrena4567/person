import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> listOfPerson = FileReader.fileReader("person.txt");
        System.out.println(listOfPerson);
        String name = "dfa";
        int age = 2;
        String gender = "fda";

        for (int i = 0; i < listOfPerson.size(); i++) {
            for (var actualElement : listOfPerson.get(i).split(",")) {
                if (actualElement.length() > 5) {
                    name = actualElement;
                } else if (actualElement.equals("nő") || actualElement.equals("férfi")) {
                    gender = actualElement;
                } else if (actualElement.length() < 3) {
                    age = Integer.parseInt(actualElement);

                }
            }
            Person person = new Person(name, age, gender);
            personList.add(person);
        }
        System.out.println(personList);
    }
}
