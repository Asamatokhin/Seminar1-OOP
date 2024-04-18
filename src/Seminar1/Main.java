package Seminar1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", LocalDate.of
                (1993,6,6),new ArrayList<>(), "Чумка","Александр", 4);

        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Орёл", LocalDate.of
                (1994,2,1),new ArrayList<>(), "НеЧумка","Владимир");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("==================");
        barsik.lifeCycle();

    }
}
