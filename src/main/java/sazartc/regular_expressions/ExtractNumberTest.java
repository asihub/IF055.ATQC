package sazartc.regular_expressions;

import sazartc.common_libraries.CsvReader;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumberTest {
    public static void main(String[] args) {
        final String SENTENCIES_WITH_NUMBERS_FILENAME =
                "src\\main\\resources\\sazartc\\regular_expressions\\\\sentenciesWithNumbers.csv";
        final String NUMBER_PATTERN = "\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(NUMBER_PATTERN);

        List<String> sentenciesWithNumbers = CsvReader.INSTANCE.readFromCsv(SENTENCIES_WITH_NUMBERS_FILENAME);

        for (String sentencyWithNumbers: sentenciesWithNumbers) {
            Matcher matcher = pattern.matcher(sentencyWithNumbers);
            System.out.printf("Extracted numbers from [%40s]: ", sentencyWithNumbers);
            while (matcher.find()) {
                System.out.printf("%s ", matcher.group());
            }
            System.out.println();
        }

    }

}


