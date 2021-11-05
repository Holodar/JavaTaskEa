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

                List<Cat> catList = new ArrayList<>();
                catList.add(new Cat("Tom", "male", 2));
                catList.add(new Cat("Ron", "male", 3));
                catList.add(new Cat("Lisa", "female", 4));
                catList.add(new Cat("Rita", "female", 4));
                catList.add(new Cat("Nina", "female", 5));
                catList.add(new Cat("Tor", "male", 3));
                catList.add(new Cat("Grom", "male", 7));
                catList.add(new Cat("Lola", "female", 8));
                catList.add(new Cat("Mila", "female", 9));
                catList.add(new Cat("Toma", "female", 12));
                catList.add(new Cat("Tina", "female", 8));
                catList.add(new Cat("Basya", "male", 8));
                catList.add(new Cat("Degan", "male", 6));
                catList.add(new Cat("Stan", "male", 9));
                catList.add(new Cat("Sotiva", "female", 11));
                catList.add(new Cat("Babls", "male", 12));
                catList.add(new Cat("Jon", "male", 13));
                catList.add(new Cat("Nik", "male", 15));
                catList.add(new Cat("Anna", "female", 1));
                catList.add(new Cat("Shtorm", "male", 5));
                catList.add(new Cat("Kyrt", "male", 4));








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

        public static List<Cat> genderAgeSelect(List<Cat> catList) {
                return catList.stream()
                        .filter(x -> x.getGender().equals("male"))
                        .filter(age -> age.getAge() > 2 && age.getAge() < 5)
                        .collect(Collectors.toList());

        }

        public static String toline (List<Cat> catList){
                // ToDO: 2. Через Stream API нужно создать строку, которая бы содержала имена котов, записанных через запятую

                return catList.stream()
                        .map(Cat::getName)
                        .collect(Collectors.joining(", "));
        }

        public Map<Integer, List<Cat>> toMap (List<Cat> catList){
                //TodO 3. сгруппировать всех котов в мапу: Map<Integer, List<Cat>>, где Integer - это возраст котов и коллеккция котов, которые имеют этот возраст

               return    catList.stream()
                        .collect(Collectors.groupingBy(Cat::getAge));
        }

        public Cat findByNameOrDefault (List<Cat> catList,Cat cat){
                //Todo 4. через StreamApi найти кота, у которого имя начинается на "Meo" и взять певрого попавшегося, если такого не будет - выдать какого-то кота по-умолчанию.
                return catList.stream()
                        .filter(s-> s.getName().startsWith("Meo"))
                        .findFirst()
                        .orElse(cat);


        }


}

