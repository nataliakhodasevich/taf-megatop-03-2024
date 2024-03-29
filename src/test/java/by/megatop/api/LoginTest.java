package by.megatop.api;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    @DisplayName("Check login user doesn't exist")
    public void testUserNotExist(){
        given().body(LoginService.getBody("test@test.com","12345678"))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(422).body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when password empty")
    public void testEmptyPassword(){
        given().body(LoginService.getBody("test@test.com",""))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(422).body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email empty")
    public void testEmptyEmail(){
        given().body(LoginService.getBody("","12345678"))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(500);
    }

    @Test
    @DisplayName("Check login when email format invalid")
    public void testInvalidEmail(){
        given().body(LoginService.getBody("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","123456"))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(422).body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login invalid password format")
    public void testInvalidPasswordFormat(){
        given().body(LoginService.getBody("test@test.com","@#$%^&*"))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(422).body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email and password 1 symbol")
    public void testCredentialOneSymbol(){
        given().body(LoginService.getBody("t","1"))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().assertThat().statusCode(422).body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email and password invalid data type")
    public void testEmailAndPwdInvalidDataType(){
        given().body(LoginService.getBody(37544444,2345678))
                .headers(LoginService.getHeaders())
                .when().post(LoginService.LOGIN_URL).
                then().log().all().assertThat().statusCode(500);
}}
