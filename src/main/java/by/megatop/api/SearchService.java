package by.megatop.api;

import java.util.HashMap;
import java.util.Map;

public class SearchService {
    public static Map<String, String> getQueryParams(){
        Map<String,String> result=new HashMap<>();
        result.put("query","туфли");
        result.put("limit","40");
        result.put("device","desktop");
        return result;
    }
}
