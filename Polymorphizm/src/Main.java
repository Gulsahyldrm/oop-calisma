public class Main {
    public static void main(String[] args) {
        /*
        EmailLogger logger = new EmailLogger();
        logger.Log("log mesajı");
        FileLogger fileLogger = new FileLogger();
        fileLogger.Log("file logger");
         */
        BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        for (BaseLogger logger : loggers){
            logger.Log("Log Mesajı");
        }
    }
}