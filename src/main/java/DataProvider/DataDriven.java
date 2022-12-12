package DataProvider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven {

    public ArrayList<String> getData(String login) throws IOException {
        ArrayList<String> a = new ArrayList<>();

        FileInputStream fis = new FileInputStream("/Users/AbhiBhatt/Downloads/dataprovidertest.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {

            if (workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {

                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                int k = 0;
                int col = 0;
                while (cell.hasNext()) {
                    Cell value = cell.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCase")) {

                        col = k;

                    }
                    k++;
                }
                System.out.println(col);

                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(col).getStringCellValue().equalsIgnoreCase("login")) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            a.add(cv.next().getStringCellValue());
                        }
                    }
                }

            }
        }

        return a;
    }


    public static void main(String[] args) throws IOException {


    }
}
