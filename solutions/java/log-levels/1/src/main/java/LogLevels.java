import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {

    private static final String LOG_LEVEL = "(INFO|WARNING|ERROR)";
    private static final String LOG_LEVEL_TAG = "\\[" + LOG_LEVEL + "\\]";

    public static String message(String logLine) {
        return logLine.replaceFirst("^" + LOG_LEVEL_TAG + ":\\s*", "").trim();
    }

    public static String logLevel(String logLine) {
        Matcher matcher = Pattern.compile(LOG_LEVEL_TAG).matcher(logLine);
        matcher.find();
        return matcher.group(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return "%s (%s)".formatted(message(logLine), logLevel(logLine));
    }
}

