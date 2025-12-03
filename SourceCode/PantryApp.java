import java.time.LocalDate;
import java.util.Scanner;

public class PantryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pantry pantry = new Pantry();

        // Sample data
        pantry.addItem(new PerishableItem("Milk", LocalDate.now().plusDays(2)));
        pantry.addItem(new CannedItem("Monggo Beans", LocalDate.now().plusYears(2)));
        pantry.addItem(new DryItem("Instant Noodles", LocalDate.now().plusMonths(8)));
        pantry.addItem(new FrozenItem("Tender Juicy Hotdog", LocalDate.now().plusMonths(12)));
        pantry.addItem(new FrozenItem("Longganisa", LocalDate.now().plusMonths(12)));

        while (true) {
            System.out.println("\n===== Dorm Pantry Inventory System =====");
            System.out.println("[1] Add Item");
            System.out.println("[2] View All Items");
            System.out.println("[3] View Items Expiring Soon");
            System.out.println("[4] Remove Item");
            System.out.println("[5] Analytics (Items by Category)");
            System.out.println("[6] Exit"); 
            System.out.print("Choose an option: ");
            
            String raw = sc.nextLine().trim();
            if (raw.isEmpty()) continue;
            int choice;
            try {
                choice = Integer.parseInt(raw);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number (1-6).");
                continue;
            }

            switch (choice) {
                case 1:
                    addItemMenu(sc, pantry);
                    break;

                case 2:
                    pantry.showAllItems();
                    break;

                case 3:
                    pantry.showExpiringSoon();
                    break;

                case 4:
                    System.out.print("Enter name of item to remove: ");
                    String nameToRemove = sc.nextLine();
                    boolean removed = pantry.removeItem(nameToRemove);
                    if (removed) System.out.println("Item removed.");
                    else System.out.println("Item not found.");
                    break;

                case 5:
                    pantry.showAnalytics();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addItemMenu(Scanner sc, Pantry pantry) {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        int year = readInt(sc, "Enter expiration year (YYYY): ");
        int month = readInt(sc, "Enter expiration month (1–12): ");
        int day = readInt(sc, "Enter expiration day (1–31): ");

        LocalDate expDate;
        try {
            expDate = LocalDate.of(year, month, day);
        } catch (Exception e) {
            System.out.println("Invalid date. Item not added.");
            return;
        }

        System.out.println("Select Category:");
        System.out.println("[1] Canned Goods");
        System.out.println("[2] Perishable Goods");
        System.out.println("[3] Frozen Goods");
        System.out.println("[4] Dry Goods");
        System.out.println("[5] Others");
        System.out.print("Enter choice: ");
        String raw = sc.nextLine();
        int cat;
        try {
            cat = Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            cat = 5;
        }

        PantryItem item;
        switch (cat) {
            case 1 -> item = new CannedItem(name, expDate);
            case 2 -> item = new PerishableItem(name, expDate);
            case 3 -> item = new FrozenItem(name, expDate);
            case 4 -> item = new DryItem(name, expDate);
            default -> item = new OtherItem(name, expDate);
        }

        pantry.addItem(item);
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String raw = sc.nextLine().trim();
            try {
                return Integer.parseInt(raw);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}

