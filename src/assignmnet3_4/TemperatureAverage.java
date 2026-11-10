package assignmnet3_4;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TemperatureAverage {

    public static void main(String[] args) {

        double sum = 0;
        int count = 0;

        try {
            URL url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(";");

                if (data.length > 1 &&
                        data[0].startsWith("01.01.2023")) {

                    String value = data[1].replace(",", ".");

                    double temperature = Double.parseDouble(value);

                    sum = sum + temperature;
                    count++;
                }
            }

            reader.close();

            if (count > 0) {
                double average = sum / count;

                System.out.println("Number of temperatures: " + count);
                System.out.println("Average temperature: " + average + " °C");
            } else {
                System.out.println("No temperatures found");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




