package demo;

/**�Զ�ɾ����־
 * Created by Administrator on 2018-11-29.
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        while (true) {
          //  logger.trace("trace level");
         //   logger.debug("debug level");
            logger.info("info level");
            logger.warn("warn level");
            logger.error("error level");
            //logger.fatal("fatal level");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

