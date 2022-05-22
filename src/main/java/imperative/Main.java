package imperative;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Alisha", FEMALE),
                new Person("Rose", FEMALE),
                new Person("Bob", MALE),
                new Person("Luisa", FEMALE)
        );

        //Find females qty, Imperative approach:

        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(person.gender.equals(FEMALE)){
                females.add(person);
            }
        }

        System.out.println(" - Imperative approach:");
        for (Person person : females){
            System.out.println(person);
        }

        //Find females qty, Declarative approach:

        System.out.println(" - Declarative approach:");
        people.stream()
                .filter(person -> person.gender.equals(FEMALE))
          //      .collect(Collectors.toList())
                .forEach(System.out::println);
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
        MALE, FEMALE
    }
}
