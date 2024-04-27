package by.megatop.api;

import by.megatop.util.Utils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    @DisplayName("Check login user doesn't exist")
    public void testUserNotExist() {
        given()
                .body(LoginService.getBody(Utils.generateRandomEmail(), Utils.generatePassword(8)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(422)
                .body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when password empty")
    public void testEmptyPassword() {
        given()
                .body(LoginService.getBody(Utils.generateRandomEmail(), ""))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(422)
                .body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email empty")
    public void testEmptyEmail() {
        given()
                .body(LoginService.getBody("", Utils.generatePassword(8)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(500);
    }

    @Test
    @DisplayName("Check login when email format invalid")
    public void testInvalidEmail() {
        given()
                .body(LoginService.getBody(Utils.generateRandomString(175), Utils.generatePassword(8)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(422)
                .body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login invalid password format")
    public void testInvalidPasswordFormat() {
        given()
                .body(LoginService.getBody(Utils.generateRandomEmail(), Utils.generateSpecialCharacters(8)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(422)
                .body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email and password 1 symbol")
    public void testCredentialOneSymbol() {
        given()
                .body(LoginService.getBody(Utils.generateRandomString(1), Utils.generateRandomString(1)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .assertThat().statusCode(422)
                .body("message", equalTo("Вы ввели неверный номер телефона и/или пароль"));
    }

    @Test
    @DisplayName("Check login when email and password invalid data type")
    public void testEmailAndPwdInvalidDataType() {
        given()
                .body(LoginService.getBody(Utils.generateRandomNumber(13346336), Utils.generateRandomNumber(13346336)))
                .headers(LoginService.getHeaders())
                .when()
                .post(LoginService.LOGIN_URL)
                .then()
                .log().all()
                .assertThat().statusCode(500);
    }
}
