package lesson6;

import java.io.FileInputStream;
import java.io.IOException;

public class MainCsvFile {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[] {"Value 1","Value 2","Value 3"});
        data.setData(new int[][]{{100, 200, 123},{300, 400, 500}});

        CsvFile csvFile = new CsvFile();

        String fileName = "data.csv";

        csvFile.save(data,fileName);

        byte[] buf = new byte[20];
        try (FileInputStream in = new FileInputStream(fileName)) {
            int count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.println((char) buf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
