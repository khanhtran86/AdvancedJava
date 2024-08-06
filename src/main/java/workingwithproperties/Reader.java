package workingwithproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Reader {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String propertyFilePath = classLoader.getResource("SMTP.dev.properties").getPath();

        try (InputStream input = new FileInputStream(propertyFilePath)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("server"));
            System.out.println(prop.getProperty("port"));
            System.out.println(prop.getProperty("ssl"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
