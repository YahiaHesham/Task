import java.util.Date;

public interface Expiry {
    boolean isExpired();
    Date getExpiryDate();
}
