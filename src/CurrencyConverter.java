import com.google.gson.JsonObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {
    private final ExchangeRateClient exchangeRateClient;
    private final List<HistorialItem> history;

    public CurrencyConverter() {
        this.exchangeRateClient = new ExchangeRateClient();
        this.history = new ArrayList<>();
    }

    public double convertCurrency(String from, String to, double amount) {
        try {
            JsonObject rates = exchangeRateClient.getExchangeRates(from);
            if (rates.has(to)) {
                double rate = rates.get(to).getAsDouble();
                double result = amount * rate;

                // Guardar en historial
                HistorialItem item = new HistorialItem(from, to, amount, result, LocalDateTime.now());
                history.add(item);

                return result;
            } else {
                System.out.println("Moneda de destino no encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Error al convertir: " + e.getMessage());
        }
        return -1;
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No hay conversiones en el historial.");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("=== Historial de Conversiones ===");
            for (HistorialItem item : history) {
                System.out.printf("%s: %.2f %s -> %.2f %s%n",
                        item.getTimestamp().format(formatter),
                        item.getAmount(), item.getFromCurrency(),
                        item.getResult(), item.getToCurrency());
            }
        }
    }
}
