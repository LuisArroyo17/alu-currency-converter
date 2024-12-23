import java.time.LocalDateTime;

public class HistorialItem {
    private final String fromCurrency;
    private final String toCurrency;
    private final double amount;
    private final double result;
    private final LocalDateTime timestamp;

    public HistorialItem(String fromCurrency, String toCurrency, double amount, double result, LocalDateTime timestamp) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.result = result;
        this.timestamp = timestamp;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public double getResult() {
        return result;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
