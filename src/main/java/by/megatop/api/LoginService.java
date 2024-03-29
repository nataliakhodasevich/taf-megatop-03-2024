package by.megatop.api;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    public static final String LOGIN_URL="https://megatop.by/api/v1/user/login";

    public static String getBody(String email, String password) {
        return String.format("{\n" +
                "\"email\": \"%s\",\n" +
                "\"password\": \"%s\"\n" +
                "}", email, password);
    }

    public static String getBody(int email, int password) {
        return String.format("{\n" +
                "\"email\": \"%s\",\n" +
                "\"password\": %n\n" +
                "}", email, password);
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }
}