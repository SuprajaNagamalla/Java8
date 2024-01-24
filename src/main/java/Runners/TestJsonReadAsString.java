package Runners;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class TestJsonReadAsString {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        HashMap<String, String> apiNameAndUrl = new HashMap<>();
        try {

            // Read JSON file as byte array
            byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"));

            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();


            // Convert byte array to JSON string
            String jsonString = objectMapper.readValue(jsonData, String.class);


            // Print the JSON string
            System.out.println(jsonString);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
