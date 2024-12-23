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
