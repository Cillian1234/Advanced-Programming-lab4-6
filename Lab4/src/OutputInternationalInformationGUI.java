import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class OutputInternationalInformationGUI extends Frame implements ActionListener {
    String[] locales = getCountryNameAndLanguage();
    JComboBox comboBox = new JComboBox(locales);
    JTextArea textArea = new JTextArea("Result here");
    Locale selLocale;
    OutputInternationalInformationGUI() {
        c.gridx = 0;
        c.gridy = 0;
        comboBox.addActionListener(this);
        panel.add(comboBox, c);

        c.gridy = 1;
        textArea.setLineWrap(true);
        panel.add(textArea, c);

        String title = "Display Localized Information Frame";

        setTitle(title);
        setVisible(true);
    }

    public static void main(String[] args) {
        OutputInternationalInformationGUI run = new OutputInternationalInformationGUI();
    }

    public static String displayLocalizedInformation(Locale locale) {
        return "Localisation = " + locale.toString() + getDayData(locale) + getCurrencyData(locale);

    }

    private static String getDayData(Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        String datePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, IsoChronology.INSTANCE, locale);
        LocalDateTime time = LocalDateTime.now();

        return "\nDays = " + Arrays.toString(dateFormatSymbols.getWeekdays()) +
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

    private static String[] getCountryNameAndLanguage() {
        Locale[] locales = Locale.getAvailableLocales();
        String[] NamesAndLanguages = new String[locales.length];
        for (int i = 0; i < locales.length ; i++) {
            NamesAndLanguages[i] = locales[i].getDisplayCountry() + " " + locales[i].getDisplayLanguage();
        }
        return NamesAndLanguages;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selLocale = Locale.getAvailableLocales()[comboBox.getSelectedIndex()];

        textArea.setText(displayLocalizedInformation(selLocale));
    }
}
