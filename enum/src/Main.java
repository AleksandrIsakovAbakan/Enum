import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(returnsPositionOfLetterOfAlphabet("j"));

        Person[] personArray = {
                new Person("Ivan", Gender.MAN, 15),
                new Person("Olga", Gender.WOMAN, 24),
                new Person("Ira", Gender.WOMAN, 13),
                new Person("Sergei", Gender.MAN, 35),
                new Person("Oleg", Gender.MAN, 45),
                new Person("Igor", Gender.MAN, 52),
                new Person("Tanja", Gender.WOMAN, 33),
                new Person("Elena", Gender.WOMAN, 12),
                new Person("Aleksandr", Gender.MAN, 41),
                new Person("Lena", Gender.WOMAN, 26)
        };
        ArrayList<Person> persons = new ArrayList<>(List.of(personArray));
        System.out.println(listOfMenOrWomen(persons, Gender.MAN));
    }


    /*
    Необходимо написать метод, который возвращает позицию буквы алфавита.
    Для реализации программы создать enum алфавита.
    */
    public static int returnsPositionOfLetterOfAlphabet(String letterOfAlphabet) {
        return Alphabet.valueOf(letterOfAlphabet.toUpperCase()).ordinal();
    }

    /*
    Написать класс Person с полями имени(name), возраста(age).
    Для определения пола Person создать enum Gender с соответствующими константами.
    В классе с методом main создать список объектов Person, состоящий не менее, чем из 10 человек разного пола.
    Написать метод, возвращающий список объектов класса Person в зависимости от введенного параметра пола,
    т.е. список мужчин или женщин.
    */
    public static List<Person> listOfMenOrWomen(List<Person> persons, Gender gender) {

        List<Person> persons1 = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equals(gender)) persons1.add(person);
        }
        return persons1;
    }
}
