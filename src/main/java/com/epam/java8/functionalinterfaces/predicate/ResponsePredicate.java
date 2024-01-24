package com.epam.java8.functionalinterfaces.predicate;


import com.epam.java8.models.Response;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ResponsePredicate {
    public static Predicate<Response> statusCode400Predicate = response -> response.getStatusCode() == 400;
    public static Predicate<Response> contentTypeJSONPredicate = response -> response.getContentType().equals("application/json");
    public static Predicate<Response> statusCode400NContentTypeJSONPredicate = response -> response.getStatusCode() == 400
            && response.getContentType().equals("application/json");
    public static Predicate<Response> statusCode400RContentTypeJSONPredicate = response -> response.getStatusCode() == 400
            || response.getContentType().equals("application/json");
    public static Predicate<Response> statusCodeNot400NContentTypeJSONPredicate = response -> response.getStatusCode() != 400
            && response.getContentType().equals("application/json");

    public List<Response> filterResponsesByPredicate(List<Response> responses, Predicate<Response> responsePredicate) {
        return responses.stream().filter(responsePredicate).collect(Collectors.toList());
    }

}
