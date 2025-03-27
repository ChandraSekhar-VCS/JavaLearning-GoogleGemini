package Java_IO.WritingLogMessages;

public class LogMessage {
    private final String message;
    private final String severity;
    private final String timeStamp;

    public LogMessage(String message, String severity) {
        this.message = message;
        this.severity = severity;
        this.timeStamp = java.time.LocalDateTime.now().toString();
    }

    public String getMessage() {
        return message;
    }

    public String getSeverity() {
        return severity;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}
