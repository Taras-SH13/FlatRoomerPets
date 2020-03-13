package home;

import roomer.AnyLodger;

import java.awt.*;
import java.util.ArrayList;

public class HomeHolder implements SettleTenants {

    String name;

    @Override
    public void settl(AnyLodger lodger, Flat flat, ArrayList arrayList) {
        flat.quantityOfResidents = flat.quantityOfResidents + lodger.quantity; // добавляем жильца
        arrayList.add(flat); // добавляем квартиру в список
        flat.aboutFlat();

    }
}