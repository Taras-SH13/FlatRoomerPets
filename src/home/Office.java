package home;

import roomer.AnyLodger;
// Сюда приходят жильцы и их селит домоуправляющий.
public class Office extends Home {
    public static void main(String[] args) {

        HomeHolder ivanPetrovich = new HomeHolder(); // Создаем домоуправляющего

       // Пришли новые жильцы

        AnyLodger klava = new AnyLodger("Klava", 18, 1);
        AnyLodger klavasFather = new AnyLodger("Oleg", 57, 1);
        AnyLodger klavasMohter = new AnyLodger("Lena", 48, 1);
        AnyLodger klavasbrothe1 = new AnyLodger("Vova", 18, 1);
        AnyLodger klavasbrother2 = new AnyLodger("Egor", 57, 1);
        AnyLodger klavasbrother3 = new AnyLodger("Misha", 48, 1);

        // создали две новые квартиры

        Flat flat1 = new Flat(3);
        Flat flat2 = new Flat(4);
        Flat flat3 = new Flat(1);
        Flat flat4 = new Flat(5);
        Flat flat5 = new Flat(3);
        Flat flat6 = new Flat(4);

        // Домоуправляющий поселил жильцов в эти квартиры

        ivanPetrovich.settl(klava, flat1,listOfFlats);
        ivanPetrovich.settl(klavasFather, flat1,listOfFlats);
        ivanPetrovich.settl(klavasMohter, flat2,listOfFlats);



        aboutHome();


    }
}
