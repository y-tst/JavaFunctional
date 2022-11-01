package sterams;

import java.util.List;
import java.util.stream.Collectors;

import static sterams._Streams.Gender.*;

public class _Streams {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Alisha", FEMALE),
                new Person("Rose", FEMALE),
                new Person("Bob", MALE),
                new Person("Bob", MALE),
                new Person("Max", RATHER_NOT_TO_SAY)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemails = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsOnlyFemails);

        boolean containsBobName = people.stream()
                .anyMatch(person -> person.name.equals("Bob"));
        System.out.println(containsBobName);
    }


    static class Person{
        private  final  String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender{
        MALE, FEMALE, RATHER_NOT_TO_SAY
    }
}
