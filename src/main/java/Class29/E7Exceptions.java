package Class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E7Exceptions {
    public static void main(String[] args) {
        E8Exceptions e=new E8Exceptions();
        e.getClass();
    }



    void readFile()  {
        read();
    }


    void read()  {
        try {
            FileInputStream fis=new FileInputStream("C://sdsds");
        }catch (FileNotFoundException f){

        }

    }
}




