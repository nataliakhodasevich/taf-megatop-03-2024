package by.megatop.api;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class SearchTest {
    @Test
    public void testSearch() {
        given()
                .queryParams(SearchService.getQueryParams())
                .when()
                .get("https://megatop.by/api/v1/search/process")
                .then()
                .statusCode(200)
                .body("products[0].name", containsString("Туфли"));
    }
}
