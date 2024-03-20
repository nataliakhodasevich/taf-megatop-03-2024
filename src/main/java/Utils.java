import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {
    public static String getRandomSite() {
        List<String> sites = new ArrayList<>(Arrays.asList("news", "article", "shops", "music"));
        return sites.get(getRandomNumber(sites.size()));
    }

    public static String generateRandomEmail() {
        return getRandomName() + "@" + getRandomSite() + "." + generateRandomDomain();
    }

    public static String getRandomName() {
        List<String> names = new ArrayList<>(Arrays.asList("Nata", "Lena", "Liza", "Katia", "Vita", "Rita", "Masha"));
        return names.get(getRandomNumber(names.size()));
    }

    public static int getRandomNumber(int bound) {
        Random random = new Random();
        int result = random.nextInt(bound);
        return result;
    }

    public static String generateRandomDomain() {
        return getListOfDomains().get(getRandomNumber(getListOfDomains().size()));
    }

    public static List<String> getListOfDomains() {
        List<String> domains = new ArrayList<>(Arrays.asList("com", "gov", "biz", "edu", "org"));
        return domains;
    }
}
