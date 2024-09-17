package assignment5_sandeep_sir;

public class Logger {
    private static Logger instance;
    
    private StringBuilder logMessages;
    
    private Logger() {
        logMessages = new StringBuilder();
    }
    
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        logMessages.append(message).append("\n");
    }
    
    public String getLog() {
        return logMessages.toString();
    }
    
    public void clearLog() {
        logMessages.setLength(0); 
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");
        logger1.log("This is the second log message.");

        Logger logger2 = Logger.getInstance();
        System.out.println("Logs from logger2:");
        System.out.println(logger2.getLog());

        logger2.clearLog();
        System.out.println("Logs after clearing:");
        System.out.println(logger1.getLog());
    }
}


