package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        load();
    }

    private static void load() {
        String env = System.getProperty("env", "dev");
        String filePath = "src/test/resources/config-" + env + ".properties";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
            System.out.println("Loaded config file: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file: " + filePath, e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}

