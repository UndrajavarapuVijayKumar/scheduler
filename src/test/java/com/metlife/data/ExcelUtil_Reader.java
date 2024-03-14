package com.metlife.data;

import com.metlife.utils.ReadXlsxData;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ExcelUtil_Reader {
    public class validateData {
    }
    @DataProvider
    public static Object[][] validateData() throws IOException, InvalidFormatException {

        return ReadXlsxData.readExcel("SalesforceScheduler.xlsx","LoginData");
    }
}
