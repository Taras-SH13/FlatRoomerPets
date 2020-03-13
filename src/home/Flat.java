package home;
// Описываем квартиру в многоэтажном доме.
public class Flat extends Home {

    public int theRoomQuantity;                // количество комнат
    public int floor;                         // этаж квартиры
    public int numberOffFlat;       // номер квартиры
    public int quantityOfResidents; // количество жильцов
    static int counter =0; // считаем квартиры

    public Flat(int theRoomQuantity) {
        counter++;
        this.theRoomQuantity = theRoomQuantity;
        this.numberOffFlat=counter;
        if ((counter%4)==0)
        {this.floor++;}
    }

    public void aboutFlat (){
    System.out.print("Номер квартиры - " +this.numberOffFlat);
    System.out.println("     Количество жильцов - " +this.quantityOfResidents);

}


    }

