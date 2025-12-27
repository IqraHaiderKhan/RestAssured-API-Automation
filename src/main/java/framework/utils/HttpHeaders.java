package framework.utils;

import java.util.HashMap;
import java.util.Map;


public class HttpHeaders {

    public static Map<String, String> defaultJsonHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    public static Map<String, String> withAuthToken(String token) {
        Map<String, String> headers = defaultJsonHeaders();
        headers.put("Authorization", "Bearer " + token);
        return headers;
    }
}




