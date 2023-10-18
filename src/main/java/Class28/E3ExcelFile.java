package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException{
        //Location of the file
        String path = "C:\\Users\\tamim\\OneDrive\\Desktop\\SDET_Java_Tamim\\SDETBatch17\\Files\\Employees (1).xlsx";
        //Class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("EmpData");
        // a nested data structure that is going to hold all the info from the sheet
        List<Map<String,String>>empListMap=new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++){
            // get all of the rows one by one and placing them inside the row variable
            Row row=sheet.getRow(i);
            // create a new map every time to store each row
            Map<String,String>rowMap=new LinkedHashMap<>();
            //inner loop to go through all the cells from each row

            for (int j=0; j<row.getPhysicalNumberOfCells();j++){
                // getting keys from header row
                String keyCell = headerRow.getCell(j).toString();
                //getting values from the row
                String valueCell = row.getCell(j).toString();
                //storing keys and values in the map
                rowMap.put(keyCell, valueCell);
            }
            //once map is ready store it inside the list
            empListMap.add(rowMap);
        }
        System.out.println(empListMap);


    }
    }










