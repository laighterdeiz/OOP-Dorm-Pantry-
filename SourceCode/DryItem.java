import java.time.LocalDate;

public class DryItem extends PantryItem {

    public DryItem(String name, LocalDate expirationDate) {
        super(name, expirationDate);
    }

    @Override
    public String getCategory() {
        return "Dry Goods";
    }

    @Override
    public boolean isExpiringSoon() {
        // Dry goods expiring within 90 days considered "soon"
        return getExpirationDate().isBefore(LocalDate.now().plusDays(90));
    }
}
