package com.api.riot.entities;

import java.util.HashMap;
import java.util.Map;

public class Tools {

    /**
     * @param endPoint enum with the endPoint to modify
     * @param vars, hashmap key, value, is the pattern "{key}" to replace by its "value"
     * @return String correct endPoint with filled values
     */
    public static String changeEndPoint(String endPoint, HashMap<String, String> vars) {
        String finalEndPoint = endPoint;
        for (Map.Entry<String, String> entry : vars.entrySet()) {
            finalEndPoint = finalEndPoint.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return finalEndPoint;
    }
}
