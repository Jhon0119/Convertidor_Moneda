import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("**************************************");
            System.out.println("Bienvenido al convertidor de moneda de Alura");
            System.out.println("**************************************");

            // Pedir al usuario la moneda base y la cantidad a convertir
            System.out.print("INTRODUCE LA MONEDA QUE DESEAS CONVERTIR\n" + "EJEMPLO:\n" +
                    "Dolar:USD\n" +
                    "Peso Argentino:ARS\n" +
                    "Peso Colombiano:COP\n" +
                    "Real Brasileño:BRL\n" +
                    "Peso Chileno:CLP\n");
            String monedaBase = scanner.nextLine().toUpperCase();

            System.out.print("INTRODUCE LA MONEDA BASE A LA CUAL DESEAS CONVERTIR\n" + "EJEMPLO:\n" +
                    "Dolar:USD\n" +
                    "Peso Argentino:ARS\n" +
                    "Peso Colombiano:COP\n" +
                    "Real Brasileño:BRL\n" +
                    "Peso Chileno:CLP\n");
            String monedaDestino = scanner.nextLine().toUpperCase();

            System.out.print("Por favor introduce la cantidad en " + monedaBase + " que deseas convertir\n");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            // Realizar la conversión
            double resultado = Convertidor_Moneda.convertirMoneda(cantidad, monedaBase, monedaDestino);

            System.out.println("Resultado: " + cantidad + " " + monedaBase + " = " + resultado + " " + monedaDestino);

            // Preguntar si desea continuar
            System.out.print("Deseas realizar otra conversión? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("s")) {
                continuar = false;
                System.out.println("Gracias por usar el convertidor de monedas. Hasta pronto!");
            }
        }
        scanner.close();
    }
}


