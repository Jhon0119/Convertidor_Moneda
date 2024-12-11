import com.google.gson.JsonObject;

public class Convertidor_Moneda {

    public static double convertirMoneda(double cantidad, String monedaBase, String monedaDestino) {
        JsonObject tasasDeCambio = Conexion_APPI.obtenerTasaCambio(monedaBase, monedaDestino);
        if (tasasDeCambio == null) {
            System.out.println("No se pudieron obtener las tasas de cambio.");
            return 0;
        }

        double tasa = tasasDeCambio.get(monedaDestino).getAsDouble();
        return cantidad * tasa;
    }
}
