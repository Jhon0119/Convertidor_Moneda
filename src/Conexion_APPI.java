import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conexion_APPI {
    private static final String API_KEY = "b319022080f4cda454677773"; // Obtén tu clave en https://www.exchangerate-api.com/

    public static JsonObject obtenerTasaCambio(String monedaBase, String monedaDestino) {
        try {
            String urlStr = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + monedaBase;
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(con.getInputStream());
            JsonObject response = JsonParser.parseReader(reader).getAsJsonObject();

            return response.getAsJsonObject("conversion_rates");
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            return null;
        }
    }
}
