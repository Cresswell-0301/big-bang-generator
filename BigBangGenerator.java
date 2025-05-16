import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BigBangGenerator {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                result.add("\"BIGBANG\"");
            } else if (x % 3 == 0) {
                result.add("\"BIG\"");
            } else if (x % 5 == 0) {
                result.add("\"BANG\"");
            } else {
                result.add("\"" + String.valueOf(x) + "\"");
            }
        }

        try {
            // create the file to .json type
            FileWriter file = new FileWriter("output.json");

            // Write the result to the file
            file.write(result.toString());

            // Close the file
            file.close();

            System.out.println("Successfully written to output.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
