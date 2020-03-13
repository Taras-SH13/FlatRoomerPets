package home;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Home {                         // описывает дом,количество квартир и их состояние

    public static ArrayList<Flat> listOfFlats = new ArrayList<Flat>(); // список квартир этого дома

    // выводим в консоль номера квартир
    public static void aboutHome() {

        System.out.println("Список квартир этого дома ");

        for (int i = 0; i < listOfFlats.size(); i++) {
            listOfFlats.get(i);

            System.out.print("Этаж " + listOfFlats.get(i).floor);
            System.out.println("");


        }
    }

}


