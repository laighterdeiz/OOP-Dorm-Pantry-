import java.time.LocalDate;

public abstract class PantryItem {
    private String name;
    private LocalDate expirationDate;
    private LocalDate dateAdded; // track date kung kelan inadd
    
    public PantryItem(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.dateAdded = LocalDate.now(); // default: today
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    // Pang update to ng expiration date based on last accessed
    public void updateExpiration(LocalDate lastAccessed) {
        long daysPassed = java.time.temporal.ChronoUnit.DAYS.between(lastAccessed, LocalDate.now());
        expirationDate = expirationDate.minusDays(daysPassed);
    }

    public abstract String getCategory();

    public boolean isExpiringSoon() {
        LocalDate today = LocalDate.now();
        return !expirationDate.isAfter(today.plusDays(5));
    }

    public long daysUntilExpiry() {
        return java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);
    }

    @Override
    public String toString() {
        String expireNote;
        long days = daysUntilExpiry();
        if (days < 0) {
            expireNote = " (Expired " + Math.abs(days) + " days ago)";
        } else {
            expireNote = " (" + days + " days left)";
        }
        String soon = isExpiringSoon() ? " ⚠️ Expiring Soon!" : "";
        return "[" + getCategory() + "] " + name + " | Expires: " + expirationDate + expireNote + soon;
    }
}
