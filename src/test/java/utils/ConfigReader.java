package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // declare Properties type variable
    static Properties prop;

    public static Properties readProperties(String filePath) {
        // we are reading file here
        try {
            FileInputStream  fis = new FileInputStream(filePath);
            // creating new object of the Properties class
            prop = new Properties();
            // assigning (loading) the values of the properties file to the Properties variable prop
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

    // to fetch value from the properties file we use this method and pass as parameter needed key
    public static String getPropertiesValue(String key) {
        return prop.getProperty(key);
    }
}
