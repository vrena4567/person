import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> listOfPerson = FileReader.fileReader("person.txt");
        System.out.println(listOfPerson);

        for (var line : listOfPerson) {
            String[] lineAsArray = line.split(",");
            String name = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            Gender gender = lineAsArray[2].equals("nő") ? Gender.FEMALE : Gender.MALE;
            Person person = new Person(name, age, gender);
            personList.add(person);
        }
        System.out.println(personList);
    }
}
