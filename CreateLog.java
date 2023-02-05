import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * Класс для логирования
*/
public class CreateLog {


        private static final Logger logger = Logger.getLogger(Present.class.getName());

   public void createFileLog() throws IOException{
       FileHandler fileHandler=new FileHandler("log.txt");
       fileHandler.setFormatter(new SimpleFormatter());
       logger.addHandler(fileHandler);
   }
    public void logMessage(String message)  {
        logger.info(message);
    }

}
