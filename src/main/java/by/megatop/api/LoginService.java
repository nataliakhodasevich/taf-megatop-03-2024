package by.megatop.api;

public class LoginService {

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
}