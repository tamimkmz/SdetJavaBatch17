package Class27;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


public class E4ExcelFile {
    public static  void main(String[] args) throws IOException {
      //  location of file
        String path = "C:\\Users\\tamim\\OneDrive\\Desktop\\SDET_Java_Tamim\\SDETBatch17\\Files\\Employees.xlsx";
//class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        //that special class which knows how to Excel files
       XSSFWorkbook book= new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = book.getSheet("Sheet1");

        Row row=sheet.getRow(1);
        Cell cell=row.getCell(2);
        System.out.println(cell);



    }}
