package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static com.codeborne.xlstest.XLS.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXLSXFromPath;

public class ExcelFilesTests {

    @Test
    public void xlsxTest() {
        String filePath = "src/resources/Document_xlsx.xlsx";
        String expectedText = "get file quickly";

        assertThat(getXLSXFromPath(filePath), containsText(expectedText));
    }

    @Test
    public void xlsxCellTest() {
        String filePath = "src/test/resources/Document_xlsx.xlsx";
        String expectedText = "get file quickly";
        XLS xlsx = getXLSXFromPath(filePath);
        String actualText = xlsx.excel.getSheetAt(0).getRow(2).getCell(2).getStringCellValue();

        assertThat(actualText, containsString(expectedText));
    }
}
