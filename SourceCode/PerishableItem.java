import java.time.LocalDate;

public class PerishableItem extends PantryItem {
    public PerishableItem(String name, LocalDate expirationDate) {
        super(name, expirationDate);
    }

    @Override
    public String getCategory() {
        return "Perishable";
    }
}
