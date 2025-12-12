package framework.utils;

public class RequestLogger {

    public static void logRequest(String method, String url, Object body) {
        System.out.println("=======================================");
        System.out.println("API Request");
        System.out.println("Method: " + method);
        System.out.println("URL: " + url);

        if (body != null) {
            System.out.println("Body: " + body.toString());
        }

        System.out.println("=======================================");
    }

    public static void logResponse(int statusCode, String responseBody) {
        System.out.println("----------- Response ------------------");
        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body:");
        System.out.println(responseBody);
        System.out.println("=======================================");
    }
}



