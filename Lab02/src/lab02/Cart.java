package lab02;

import java.util.ArrayList;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            qtyOrdered++;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }
}
