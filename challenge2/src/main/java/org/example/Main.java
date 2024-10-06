package org.example;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        ApiCliente apicliente = new ApiCliente();
        String tasas = apicliente.obtener_tasas();

        // Convertir el string JSON en un objeto Java (TasasResponse)
        Gson gson = new Gson();
        TasasResponse tasasResponse = gson.fromJson(tasas, TasasResponse.class);

        // Acceder a la clave "conversion_rates"
        Map<String, Double> conversionRates = tasasResponse.getConversionRates();

        // Mostrar los valores de conversion_rates
        System.out.println(conversionRates.get("ALL"));
    }
}
