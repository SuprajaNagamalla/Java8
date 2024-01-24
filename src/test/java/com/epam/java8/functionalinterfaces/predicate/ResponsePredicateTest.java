package com.epam.java8.functionalinterfaces.predicate;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

import static com.epam.java8.functionalinterfaces.predicate.ResponsePredicate.*;

public class ResponsePredicateTest extends BaseTest {
    ResponsePredicate responsePredicate = new ResponsePredicate();

    @Test
    public void testPrintAllResponseByStatusCode() {
        System.out.println(GREEN_BOLD + "HomeTask_2_6: " + RESET + "Print all the responses with status code 400"
                + "\nInput:" + responses
                + "\nOutput:" + responsePredicate.filterResponsesByPredicate(responses, statusCode400Predicate) + "\n");
    }

    @Test
    public void testPrintAllResponseByContentType() {
        System.out.println(GREEN_BOLD + "HomeTask_2_7: " + RESET + "Print all the responses with response type JSON"
                + "\nInput:" + responses
                + "\nOutput:" + responsePredicate.filterResponsesByPredicate(responses, contentTypeJSONPredicate) + "\n");
    }

    @Test
    public void testPrintAllResponseByStatusCodeNContentType() {
        System.out.println(GREEN_BOLD + "HomeTask_2_8: " + RESET + "Print all the responses with status code 400 and response type JSON"
                + "\nInput:" + responses
                + "\nOutput:" + responsePredicate.filterResponsesByPredicate(responses, statusCode400NContentTypeJSONPredicate) + "\n");
    }

    @Test
    public void testPrintAllResponseByStatusCodeRContentType() {
        System.out.println(GREEN_BOLD + "HomeTask_2_9: " + RESET + "Print all the responses with status code 400 or response type JSON"
                + "\nInput:" + responses
                + "\nOutput:" + responsePredicate.filterResponsesByPredicate(responses, statusCode400RContentTypeJSONPredicate) + "\n");
    }

    @Test
    public void testPrintAllResponseByNotStatusCodeNContentType() {
        System.out.println(GREEN_BOLD + "HomeTask_2_9: " + RESET + "Print all the responses with status code is not 400 and response type JSON"
                + "\nInput:" + responses
                + "\nOutput:" + responsePredicate.filterResponsesByPredicate(responses, statusCodeNot400NContentTypeJSONPredicate) + "\n");
    }
}