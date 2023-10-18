package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        /*
       Location of the file
        String path="C:\\Users\\tamim\\OneDrive\\Desktop\\SDET_Java_Tamim\\SDETBatch17\\Files\\config.properties";
       */

        String Path=System.getProperty("user.dir")+"\\Files\\config.properties";
        //Moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(Path);
        // That one class/software that will assist us to read Write data from the file.
        Properties properties=new Properties();
        //Loads the data from txt file into the properties object
        properties.load(fis);
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));
        System.out.println(properties.get("URL"));
        // This line here gives the location of your intellij project on your computer
        System.out.println(System.getProperty("user.dir"));
    }
}

