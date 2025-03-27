package Java_IO.WritingLogMessages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MessageLogger {
    public static void main(String[] args) {
        List<LogMessage> messages = new ArrayList<>();
        messages.add(new LogMessage("This is message 1","INFO"));
        messages.add(new LogMessage("This is message 2","WARNING"));
        messages.add(new LogMessage("This is message 3","ERROR"));
        messages.add(new LogMessage("This is message 4","INFO"));
        messages.add(new LogMessage("This is message 5","WARNING"));

        try(PrintWriter pw = new PrintWriter("application.log")){
            pw.println("[Timestamp] [Severity Level] Message");
            for(LogMessage m : messages){
                pw.printf("%-10s,%-10s,%-10s\n",m.getTimeStamp(),m.getSeverity(),m.getMessage());
            }
            System.out.println("Log has been created successfully");
        }
        catch (IOException e){
            System.out.println("Error in writing to the log file");
        }
    }
}
