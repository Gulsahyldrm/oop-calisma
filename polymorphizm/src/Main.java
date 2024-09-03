public class Main {
    public static void main(String[] args) {
        /*
        EmailLogger logger = new EmailLogger();
        logger.log("log mesajı");
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("file logger");
         */
        BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        for (BaseLogger logger : loggers){
            logger.log("Log Mesajı");
        }
    }
}