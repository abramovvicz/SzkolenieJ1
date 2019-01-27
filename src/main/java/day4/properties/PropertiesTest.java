package day4.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {
    final String FILE_NAME = "config.properties";
    Properties properties = new Properties();


    public PropertiesTest() {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(FILE_NAME);
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Brak pliku properties");
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
        saveProperties();
    }

    private void saveProperties() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(FILE_NAME);
            properties.store(outputStream, "");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
