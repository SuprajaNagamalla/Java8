package Runners;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestJsonFileRead {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        HashMap<String, String> apiNameAndUrl = new HashMap<>();
        try {
            // Object obj = parser.parse(new FileReader("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"));
            JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"));

            for (Object o : a) {
                JSONObject jsonObject = (JSONObject) o;

                String name = (String) jsonObject.get("name");
                System.out.println("name::" + name);
                apiNameAndUrl.put("name", name);

//                String url = (String) jsonObject.get("url");
//                System.out.println("url::"+url);
//                apiNameAndUrl.put("url", url);

//                String job = (String) jsonObject.get("job");
//                System.out.println(job);
//
                // loop call array

                JSONArray callsArray = (JSONArray) jsonObject.get("calls");

//                for (int i = 0; i < callsArray.toArray().length; i++) {
//                    JSONObject callObj = (JSONObject) callsArray.get(i);
//                    JSONObject onObj = callObj.getJSONObject("on");
//                    String url = onObj.getString("url");
//                    System.out.println("URL: " + url);
//                }
//                JSONArray callsArray = (JSONArray) jsonObject.get("calls");
//                List<String> list = new ArrayList<String>();
//                for(int i = 0 ; i < callsArray.toArray().length; i++) {
//                    list.add(callsArray.get(i).get("url"));
//                    System.out.println(jsonArray.getJSONObject(i).getString("url")); // display usernames
//                }
                JSONArray calls = (JSONArray) jsonObject.get("calls");
                for (Object call : calls) {
                    JSONObject jsonCall = (JSONObject) call;
                    if(jsonCall.containsKey("on")){
                        //JSONObject on=  (JSONObject) jsonCall.getOrDefault("on","url");
                        JSONObject on=  (JSONObject) jsonCall.get("on");
                        String url = (String) on.get("url");
                        System.out.println("URL: " + url);
                        apiNameAndUrl.put("url", url);
                    }
                }
//                JSONObject jsonObjectOn = (JSONObject) calls.get(0);
//                String name = (String) jsonObjectOn.get("url");
//                Iterator<String> iterator = calls.iterator();
//                while (iterator.hasNext()) {
//                    System.out.println(iterator.next());
//                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("------Read from Map: ----------" );
        System.out.println("size::"+apiNameAndUrl.size());

        for (Map.Entry<String, String> api : apiNameAndUrl.entrySet()) {
            System.out.println(api.getKey() + " " + api.getValue());
        }
    }

}
