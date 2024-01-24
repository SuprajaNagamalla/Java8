package Runners;
import java.io.FileReader;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonReader {

    public static void main(String[] args) {
        try {
            // Parse JSON file using GSON library
            Gson gson = new Gson();
            List<Call> calls = gson.fromJson(new FileReader("C:\\Users\\Supraja_Nagamalla\\APIURLDataRead\\suite.json"),
                    new TypeToken<List<Call>>() {}.getType());

            // Iterate over calls to extract URL
            for (Call call : calls) {
                System.out.println(call.on.url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Define Java class to represent "calls" JSON object
    private static class Call {
        private On on;
    }

    // Define Java class to represent "on" JSON object
    private static class On {
        private String url;
    }

}

