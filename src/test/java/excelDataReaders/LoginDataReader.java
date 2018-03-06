package excelDataReaders;

import builders.LoginDetailsBuilder;
import entities.LoginDetails;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class LoginDataReader extends ExcelReader {

    private Sheet loginDetailsSheet;

    public LoginDataReader(String testData) {
        super(testData);
        loginDetailsSheet = workbook.getSheet("loginDetailsSheet");
    }

    public LoginDetails getLoginDetails(String loggedInUserDataId) {
        Row dataRow = readDataRow(loginDetailsSheet, loggedInUserDataId);
        String username = getCellData(loginDetailsSheet, dataRow, "username").getStringCellValue();
        String password = convertNumericToString(loginDetailsSheet, dataRow, "password");

        return new LoginDetailsBuilder()
                .withUsername(username)
                .withPassword(password)
                .build();
    }
}
