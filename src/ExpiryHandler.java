import java.util.Date;

public class ExpiryHandler implements Expiry {
    private final Date expiryDate;

    public ExpiryHandler(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        Date today = new Date();
        return expiryDate != null && today.after(expiryDate);
    }

    @Override
    public Date getExpiryDate() {
        return expiryDate;
    }
}