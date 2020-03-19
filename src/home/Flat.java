package home;
// Описываем квартиру в многоэтажном доме.
public class Flat extends Home {

    public int theRoomQuantity;                // количество комнат
    public int floor=1;                         // этаж квартиры
    public int numberOffFlat;       // номер квартиры
    public int quantityOfResidents; // количество жильцов
    static int counter =0; // считаем квартиры

    public Flat(int theRoomQuantity) {
        counter++;
        this.theRoomQuantity = theRoomQuantity;
        this.numberOffFlat=counter;
        if (counter >4 ) // TODO Как сделать чтобы квартиры правильно распределялись по этажам!?
        {this.floor++;}
    }

    public void aboutFlat (){
    System.out.print("Номер квартиры - " +this.numberOffFlat);
    System.out.println("     Количество жильцов - " +this.quantityOfResidents);

}

    @Override
    public String toString() {
        return "Flat{" +
                "Количество комнат = " + theRoomQuantity +
                ", Этаж = " + floor +
                ", Номер квартиры = " + numberOffFlat +
                ", Количество жильцов = " + quantityOfResidents +
                '}';
    }
}

