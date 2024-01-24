package Runners;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonFileDataReader {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        HashMap<String, String> apiNameAndUrl = new HashMap<>();
        ArrayList<String> apiName = new ArrayList<>();
        ArrayList<String> apiUrl = new ArrayList<>();
        try {
            // Object obj = parser.parse(new FileReader("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"));
            JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"));

            for (Object o : a) {
                JSONObject jsonObject = (JSONObject) o;
                String name = (String) jsonObject.get("name");
                System.out.println("name::" + name);
                //apiNameAndUrl.put("name", name);
                apiName.add(name);
                JSONArray calls = (JSONArray) jsonObject.get("calls");
                for (Object call : calls) {
                    JSONObject jsonCall = (JSONObject) call;
                    JSONObject on = (JSONObject) jsonCall.get("on");
                    String url = (String) on.get("url");
                    System.out.println("URL: " + url);
                    if(!url.equals("{createdRequestUrl}")){
                        apiUrl.add(url);
                    }
                    String onlyUrl = ((JSONObject) jsonCall.get("on")).get("url").toString();
                    //apiNameAndUrl.put("url", url);
                    System.out.println("only URL: "+onlyUrl);

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println("------Read from Map: ----------");
//        System.out.println("size::" + apiNameAndUrl.size());
//
//        for (Map.Entry<String, String> api : apiNameAndUrl.entrySet()) {
//            System.out.println(api.getKey() + " " + api.getValue());
//        }

        System.out.println("------Read from List: ----------");
        System.out.println("------Read from List size: ----------"+apiName.size());
        for (String name : apiName) {
            System.out.println(name);
        }

        System.out.println("------Read from URL: ----------");
        System.out.println("------Read from Url size: ----------"+apiUrl.size());
        for (String url : apiUrl) {
            System.out.println(url);
        }
    }

}
