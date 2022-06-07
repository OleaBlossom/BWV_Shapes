package Prices;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PriceDataRetriever {
    private final String delimiter;
    private Path file;
    private HashMap<String, Double> records;

    public PriceDataRetriever(String filename, String delimiter) {
        setFile(filename);
        this.delimiter = delimiter;

        retrieve();
    }

    public PriceDataRetriever(String filename) {
        this(filename, ", ");
    }

    public HashMap<String, Double> getRecords() {
        return records;
    }

    public void retrieve() {
        records = new HashMap<>();

        try {
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                if (line != null) {
                    // material is stored on the left, price on the right
                    String[] priceByMaterial = line.split(delimiter);
                    String material = priceByMaterial[0];

                    // prices from european to us style
                    String price = priceByMaterial[1].replace(',', '.');

                    records.put(material, Double.parseDouble(price));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("CSV-file does not exist.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("malformed file or unmappable byte sequence");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setFile(String filename) {
        String path = "resources/" + filename;
        this.file = Paths.get(path);
    }
}
