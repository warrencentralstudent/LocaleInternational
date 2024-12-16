import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class LocaleDateConversion {

    public static void main(String[] args) {
        Locale usLocale = Locale.US; // Define Locale for US
        Locale franceLocale = Locale.FRANCE; // Define Locale for France
        Locale japanLocale = Locale.JAPAN; // Define Locale for Japan

        LocalDate now = LocalDate.now(); // Initialize the current date

        printFormattedDate(Locale.US, LocalDate.now());
        printFormattedDate(Locale.FRANCE, LocalDate.now());
        printFormattedDate(Locale.JAPAN, LocalDate.now());
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.US);
        DateTimeFormatter frFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.FRANCE);
        DateTimeFormatter jpFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.JAPAN);
        String formattedDateUS = now.format(usFormatter);
        String formattedDateFR = now.format(frFormatter);
        String formattedDateJP = now.format(jpFormatter);
        System.out.println("Formatted Date (United States): " + formattedDateUS);
        System.out.println("");
        System.out.println("Formatted Date (France): " + formattedDateFR);
        System.out.println("");
        System.out.println("Formatted Date (Japan): " + formattedDateJP);
        System.out.println("");
    }



}