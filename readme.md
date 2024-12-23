# Conversor de Monedas en Java

Este proyecto es un conversor de monedas en Java que utiliza la API [Exchange Rate API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real. El programa permite convertir entre múltiples monedas, realizar un seguimiento del historial de conversiones y registrar las operaciones con marcas de tiempo.

## Características

- **Conversión de monedas**: Convierte entre múltiples monedas utilizando tasas de cambio actuales.
- **Historial de conversiones**: Mantiene un registro de las conversiones realizadas.
- **Marcas de tiempo**: Cada entrada en el historial incluye la fecha y hora de la conversión.
- **Interfaz de consola**: Menú interactivo para facilitar el uso.

## Requisitos

- **Java 11 o superior**: Requerido para utilizar la biblioteca `HttpClient`.
- **Biblioteca Gson**: Para analizar y manejar respuestas JSON.

# EJEMPLO DE USO
=== Conversor de Monedas ===
1. Convertir Moneda
2. Mostrar Historial de Conversiones
3. Salir
- Seleccione una opción: 1

- Ingrese la moneda de origen (e.g., USD): USD
- Ingrese la moneda de destino (e.g., EUR): EUR
- Ingrese la cantidad: 100

- Resultado: 91.20 EUR

=== Conversor de Monedas ===
1. Convertir Moneda
2. Mostrar Historial de Conversiones
3. Salir
- Seleccione una opción: 2

=== Historial de Conversiones ===
- 2024-12-23 15:30:00: 100.00 USD -> 91.20 EUR

=== Conversor de Monedas ===
1. Convertir Moneda
2. Mostrar Historial de Conversiones
3. Salir
- Seleccione una opción: 3

- ¡Gracias por usar el conversor de monedas!
