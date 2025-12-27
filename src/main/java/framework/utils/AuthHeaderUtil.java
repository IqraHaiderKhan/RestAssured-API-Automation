package framework.utils;

import java.util.HashMap;
import java.util.Map;

public class AuthHeaderUtil {

    private AuthHeaderUtil() {
        // prevent instantiation
    }

    public static Map<String, String> bearerToken(String token) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + token);
        headers.put("Content-Type", "application/json");
        return headers;
    }

    public static Map<String, String> basicAuth(String username, String password) {
        String basicAuth = java.util.Base64.getEncoder()
                .encodeToString((username + ":" + password).getBytes());

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + basicAuth);
        headers.put("Content-Type", "application/json");
        return headers;
    }
}




