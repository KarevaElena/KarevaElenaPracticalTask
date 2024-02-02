package lesson6;

import java.io.*;

public class CsvFile {
    public void save(AppData data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String headerLine = String.join(";",data.getHeader());
            writer.write(headerLine);
            writer.newLine();

            for (int[] row : data.getData()) {
                String dataLine = "";
                for (int value : row) {
                    dataLine += value + ";";
                }
                writer.write(dataLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
