package manager;

import model.Medicine;
import java.util.*;

public class PharmacyManager {
    private List<Medicine> inventory = new ArrayList<>();

    public void addMedicine(Medicine m) {
        inventory.add(m);
        System.out.println("Medicine added successfully.");
    }

    public void viewAll() {
        if (inventory.isEmpty()) {
            System.out.println("No medicines in inventory.");
        } else {
            for (Medicine m : inventory) {
                System.out.println(m);
            }
        }
    }

    public Medicine searchByName(String name) {
        for (Medicine m : inventory) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    public void updateStock(String name, int quantity) {
        Medicine m = searchByName(name);
        if (m != null) {
            m.setQuantity(quantity);
            System.out.println("Stock updated.");
        } else {
            System.out.println("Medicine not found.");
        }
    }

    public void sellMedicine(String name, int qty) {
        Medicine m = searchByName(name);
        if (m != null && m.getQuantity() >= qty) {
            m.setQuantity(m.getQuantity() - qty);
            System.out.println("Sold " + qty + " units. Remaining: " + m.getQuantity());
        } else {
            System.out.println("Insufficient stock or medicine not found.");
        }
    }

    public void deleteMedicine(String name) {
        Medicine m = searchByName(name);
        if (m != null) {
            inventory.remove(m);
            System.out.println("Medicine deleted.");
        } else {
            System.out.println("Medicine not found.");
        }
    }
}