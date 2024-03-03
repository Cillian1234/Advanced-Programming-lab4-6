import java.text.DateFormatSymbols;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

public class OutputInternationalInformation {
    public static void main(String[] args) {
        Locale FR = new Locale("fr", "FR");
        Locale EN = new Locale("en", "EN");
        Locale JP = new Locale("ja", "JP");

        displayLocalizedInformation(EN);
    }

    public static void displayLocalizedInformation(Locale locale) {
        System.out.printf("Localisation = %S \nDays of week = %S \nMonths = %S",
                locale.toString(), getDays(locale, "days"), getDays(locale, "months"));

        System.out.println("********************************");
        System.out.println();
    }

    private static String getDays(Locale locale, String datasetWanted) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        DateTimeFormatter dateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);


        return switch (datasetWanted) {
            case "days" -> Arrays.toString(dateFormatSymbols.getWeekdays());
            case "months" -> Arrays.toString(dateFormatSymbols.getMonths());
            case "dates" -> dateTime.toString();
            default -> null;
        };
    }
}
