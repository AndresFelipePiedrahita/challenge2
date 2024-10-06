package org.example;

import java.util.Map;

public class TasasResponse {
    private Map<String, Double> conversion_rates;

    // Getters y setters
    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
