import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Convertir Moneda");
            System.out.println("2. Mostrar Historial de Conversiones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la moneda de origen (e.g., USD): ");
                    String fromCurrency = scanner.next().toUpperCase();
                    System.out.print("Ingrese la moneda de destino (e.g., EUR): ");
                    String toCurrency = scanner.next().toUpperCase();
                    System.out.print("Ingrese la cantidad: ");
                    double amount = scanner.nextDouble();

                    double result = converter.convertCurrency(fromCurrency, toCurrency, amount);
                    if (result != -1) {
                        System.out.printf("Resultado: %.2f %s%n", result, toCurrency);
                    } else {
                        System.out.println("Conversión fallida. Revise las monedas ingresadas.");
                    }
                }
                case 2 -> converter.showHistory();
                case 3 -> {
                    System.out.println("¡Gracias por usar el conversor de monedas!");
                    return;
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
