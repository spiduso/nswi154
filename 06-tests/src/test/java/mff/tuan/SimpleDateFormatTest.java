package mff.tuan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDateFormatTest {

    @ParameterizedTest
    @CsvSource({
            "yyyy-MM-dd, 22.01.03",
            "yyyy-MM-dd, 2023.02.13",
            "yyyy-MM-dd, 2023-02.13"
    })
    public void parseDateParseException(String pattern, String wrongParsingString) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        assertThrows(ParseException.class, () -> formatter.parse(wrongParsingString));
    }

    @ParameterizedTest
    @CsvSource({
            "yyyy-MM-dd, 2023-02-13",
            "yyyy.MM-dd, 2023.02-13",
            "yyyy.MM.dd, 2023.02.13",
            "yy.MM.dd, 23.02.13",
            "dd.MM.yyyy, 13.02.23",
    })
    public void parseDateCorrectStringFormat(String pattern, String parsingString) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        try {
            formatter.parse(parsingString);
        } catch (ParseException exception) {
            fail("Parse exception was thrown, when it should not have. Check data source.");
        }
    }

    @ParameterizedTest
    @CsvSource({
            "yyyy-MM-dd, 2023-02-13",
            "yyyy.MM-dd, 2023.02-13",
            "yyyy.MM.dd, 2023.02.13",
            "yy.MM.dd, 23.02.13",
            "dd.MM.yyyy, 13.02.2023",
    })
    public void parseDatesCorrectStringFormat(String pattern, String parsingString) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        try {
            assertEquals(formatter.format(formatter.parse(parsingString)), parsingString);
        } catch (ParseException exception) {
            fail("Parse exception was thrown, when it should not have. Check data source.");
        }
    }
}
