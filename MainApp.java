import java.util.*;
import manager.PharmacyManager;
import model.Medicine;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PharmacyManager manager = new PharmacyManager();
        int choice;

        do {
            System.out.println("\n--- Pharmacy Management System ---");
            System.out.println("1. Add Medicine");
            System.out.println("2. View All Medicines");
            System.out.println("3. Search Medicine");
            System.out.println("4. Update Stock");
            System.out.println("5. Sell Medicine");
            System.out.println("6. Delete Medicine");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    manager.addMedicine(new Medicine(id, name, qty, price));
                    break;

                case 2:
                    manager.viewAll();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    Medicine found = manager.searchByName(searchName);
                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Medicine not found.");
                    break;

                case 4:
                    System.out.print("Enter name: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    manager.updateStock(updateName, newQty);
                    break;

                case 5:
                    System.out.print("Enter name: ");
                    String sellName = sc.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int sellQty = sc.nextInt();
                    manager.sellMedicine(sellName, sellQty);
                    break;

                case 6:
                    System.out.print("Enter name to delete: ");
                    String delName = sc.nextLine();
                    manager.deleteMedicine(delName);
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}