package by.megatop.api;
import java.util.HashMap;
import java.util.Map;

public class SearchService {
    public static Map<String, String> getQueryParams(String itemForSearch) {
        Map<String, String> result = new HashMap<>();
        result.put("query", itemForSearch);
        result.put("limit", "40");
        result.put("device", "desktop");
        return result;
    }
}
