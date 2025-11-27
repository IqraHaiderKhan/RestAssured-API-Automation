package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve the base URL from the properties file
    public static String getBaseUrl() {
        return properties.getProperty("base.url");
    }

    // Method to retrieve the timeout value from the properties file
    public static int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

    // Method to retrieve the environment from the properties file
    public static String getEnvironment() {
        return properties.getProperty("environment");
    }
}