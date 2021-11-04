package taskCats1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//ToDo нужно написать через Stream три метода:
//
//1. нужно найти всех котов мужского пола и возрастом между 2 и 5 годами и получить коллекцию из этих котов.
//2. Через Stream API нужно создать строку, которая бы содержала имена котов, записанных через запятую
//3. сгруппировать всех котов в мапу: Map<Integer, List<Cat>>, где Integer - это возраст котов и коллеккция котов, которые имеют этот возраст
//4. через StreamApi найти кота, у которого имя начинается на "Meo" и взять певрого попавшегося, если такого не будет - выдать какого-то кота по-умолчанию.



public class Main {


        public static void main(String[] args) {

                List<Cats> catsList = new ArrayList<>();
                catsList.add(new Cats("Tom", "male", 2));
                catsList.add(new Cats("Ron", "male", 3));
                catsList.add(new Cats("Lisa", "female", 4));
                catsList.add(new Cats("Rita", "female", 4));
                catsList.add(new Cats("Nina", "female", 5));
                catsList.add(new Cats("Tor", "male", 3));
                catsList.add(new Cats("Grom", "male", 7));
                catsList.add(new Cats("Lola", "female", 8));
                catsList.add(new Cats("Mila", "female", 9));
                catsList.add(new Cats("Toma", "female", 12));
                catsList.add(new Cats("Tina", "female", 8));
                catsList.add(new Cats("Basya", "male", 8));
                catsList.add(new Cats("Degan", "male", 6));
                catsList.add(new Cats("Stan", "male", 9));
                catsList.add(new Cats("Sotiva", "female", 11));
                catsList.add(new Cats("Babls", "male", 12));
                catsList.add(new Cats("Jon", "male", 13));
                catsList.add(new Cats("Nik", "male", 15));
                catsList.add(new Cats("Anna", "female", 1));
                catsList.add(new Cats("Shtorm", "male", 5));
                catsList.add(new Cats("Kyrt", "male", 4));








        /*//ToDo: init list\

        ArrayList<Cats> cats = new ArrayList<>();
        Random rand = new Random();

        // IntStream
        IntStream.range(0, 10000)
                .mapToObj(i -> new Cats("Ron", rand.nextInt(20)))
                .filter(cats2 -> cats2.getAge() < 3)
                .forEach(c -> System.out.println(c.getAge() + " " + c.getName()));

        // map()

        /*for (int i = 0; i < 100; i++) {
            int randomNum = rand.nextInt(20);
            cats.add(new Cats("Ron", randomNum));
            //ToDo: add cat to list
        }

        cats.stream()

                .forEach(x -> System.out.println(x.getAge() + " " + x.getName()));


        /*    for(Cats cat : cats){
                if(cat.getAge() < 3){
                    System.out.println(cat.getAge() + " " + cat.getName());
                }
            }
        //ToDo: print count cats with age < 3

         */
        }

        // ToDO: задание 1 : 1. нужно найти всех котов мужского пола и возрастом между 2 и 5 годами и получить коллекцию из этих котов.

        public static List<Cats> genderAgeSelect(List<Cats> catsList) {
                return catsList.stream()
                        .filter(x -> x.getGender().equals("male"))
                        .filter(age -> age.getAge() > 2 && age.getAge() < 5)
                        .collect(Collectors.toList());

        }

        public static String toline (List<Cats> catsList){
                // ToDO: 2. Через Stream API нужно создать строку, которая бы содержала имена котов, записанных через запятую

                return catsList.stream()
                        .map(Cats::getName)
                        .collect(Collectors.joining(", "));
        }

        public Map<Integer, List<Cats>> toMap (List<Cats> catsList){
                //TodO 3. сгруппировать всех котов в мапу: Map<Integer, List<Cat>>, где Integer - это возраст котов и коллеккция котов, которые имеют этот возраст

               return    catsList.stream()
                        .collect(Collectors.groupingBy(Cats::getAge));
        }

        public Optional<Cats> findName(List<Cats> catsList){
                //Todo 4. через StreamApi найти кота, у которого имя начинается на "Meo" и взять певрого попавшегося, если такого не будет - выдать какого-то кота по-умолчанию.
                return catsList.stream()
                        .filter(s-> s.getName().startsWith("Meo"))
                        .findFirst();


        }


}

