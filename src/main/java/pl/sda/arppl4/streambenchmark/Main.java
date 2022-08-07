package pl.sda.arppl4.streambenchmark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Paweł Recław, AmeN
 * @project arppl4_java_zaaw
 * @created 07.08.2022
 */
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        new Person("Jan", "Kowalski", new Pet("Mruczek", Breed.CAT)),
                        new Person("Marian", "Kowalski", new Pet("Mruczek", Breed.CAT)),
                        new Person("Miriam", "Kowalski", new Pet("Mruczek", Breed.WOLF)),
                        new Person("Łoś", "Kowalski", new Pet("Mruczek", Breed.YORK)),
                        new Person("Ktoś", "Kowalski", new Pet("Mruczek", Breed.CAT))
                )
        );

        Long timeStart = System.currentTimeMillis();
        List<Pet> pets = new ArrayList<>();
        for (Person person : personList) {
            if(person.getPet().getBreed() == Breed.CAT){
                pets.add(person.getPet());
            }
        }
        Long timeEnd = System.currentTimeMillis();
        System.out.println("Time loop: " + (timeEnd-timeStart));

        Long timeStart2 = System.currentTimeMillis();
        List<Pet> pets2 = personList.stream()
                .map(new Function<Person, Pet>() {
                    @Override
                    public Pet apply(Person person) {
                        return person.getPet();
                    }
                })
                .filter(new Predicate<Pet>() {
                    @Override
                    public boolean test(Pet pet) {
                        return pet.getBreed() == Breed.CAT;
                    }
                })
                .collect(Collectors.toList());
        Long timeEnd2 = System.currentTimeMillis();
        System.out.println("Time stream: " + (timeEnd2-timeStart2));

    }
}
