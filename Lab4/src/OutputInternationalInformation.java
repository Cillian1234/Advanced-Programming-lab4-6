import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class OutputInternationalInformation {
    public static void main(String[] args) {
        Locale FR = new Locale("fr", "FR");
        Locale EN = new Locale("en", "GB");
        Locale JP = new Locale("ja", "JP");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose a locale: \n 1. FR\n 2. EN\n 3. JP\n Enter a number");
        int selection = sc.nextInt();
        switch (selection) {
            case 1 -> displayLocalizedInformation(FR);
            case 2 -> displayLocalizedInformation(EN);
            case 3 -> displayLocalizedInformation(JP);
        }
    }

    public static void displayLocalizedInformation(Locale locale) {
        System.out.printf("Localisation = %S \n%S \n%S", locale.toString(), getDayData(locale), getCurrencyData(locale));
    }

    private static String getDayData(Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        String datePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, IsoChronology.INSTANCE, locale);
        LocalDateTime time = LocalDateTime.now();

        return "Days = " + Arrays.toString(dateFormatSymbols.getWeekdays()) +
                "\nMonths + " + Arrays.toString(dateFormatSymbols.getMonths()) +
                "\nDate = " + time.format(DateTimeFormatter.ofPattern(datePattern)) +
                "\nEras = " + Arrays.toString(dateFormatSymbols.getEras());
    }

    private static String getCurrencyData(Locale locale) {
        NumberFormat numFormat = NumberFormat.getCurrencyInstance(locale);
        Currency currency = Currency.getInstance(locale);
        numFormat.setCurrency(currency);
        String formattedCurrency = numFormat.format(10000.50);
        return "Currency = " + formattedCurrency;
    }
}
