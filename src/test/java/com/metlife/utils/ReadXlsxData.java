package com.metlife.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *Author: Undrajavarapu Vijay Kumar
 *Project: Capstone project
 *
 */

public class ReadXlsxData {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFCell cell;
    private static XSSFRow row;
    private static FileInputStream fis = null;
    public static void ExcelReader(String fileName, String sheetname) {
        try {
            fis = new FileInputStream(new File(fileName));
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetname);

        } catch (FileNotFoundException var6) {
            System.out.println(fileName + " is not Found. please check the file name.");
            System.exit(0);
        } catch (IOException var7) {
            System.out.println(fis + " is not Found. please check the path.");
        } catch (Exception var8) {
            System.out.println("There is error reading/loading xls file, due to " + var8);
        }

    }
    public static String StaticIndexesCellValue(int row, int cellNUm) throws IOException, InvalidFormatException {

        File file = new File("C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\resources\\SalesforceScheduler.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);
        //Static indexes
        String cellValue = sheet.getRow(row).getCell(cellNUm).getStringCellValue();
        System.out.println(cellValue);
//        workbook.close();
//        fis.close();
        return cellValue;
    }
    public static void RetriveAllExcelValues() throws IOException, InvalidFormatException {
        //This method will findout how many rows are there and iterate each row
        File file = new File("C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\resources\\SalesforceScheduler.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int i=1; i<rowCount;i++){
            XSSFRow row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            for (int j=0;j<cellCount;j++){
                XSSFCell cell=row.getCell(j);
                System.out.print("||"+getCellValue(cell));
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }
    public static String getCellValue(XSSFCell cell){
        //this method will be used in dynamicIndexesCellValue()
        switch (cell.getCellType()){
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case STRING:
                return String.valueOf(cell.getStringCellValue());
            default:
                return cell.getStringCellValue();
        }
    }

    public static Object[][] readExcel(String workbook, String worksheet) {
        XSSFWorkbook wb;
        try {
            wb= new XSSFWorkbook(new FileInputStream("src/test/resources/"+workbook));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sh = wb.getSheet(worksheet);
        int row = sh.getPhysicalNumberOfRows()-1;
        int col = sh.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][col];
        for (int i=1;i<=row;i++){
            for(int j=0;j<col;j++){
                System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
                data[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return data;
    }
}
