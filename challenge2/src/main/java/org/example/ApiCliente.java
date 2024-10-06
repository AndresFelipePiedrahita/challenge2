package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class ApiCliente {
    private static final OkHttpClient client = new OkHttpClient();

    public String obtener_tasas() throws IOException {
        String url = "https://v6.exchangerate-api.com/v6/be3b6332326b5d3f7a855d7e/latest/USD";
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }



}
