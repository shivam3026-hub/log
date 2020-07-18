package Interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class App {
    private static Logger LOGGER = LogManager.getLogger(Area.App.class);
        public static void main(String[] args) {
            Scanner io=new Scanner(System.in);
            double principle,rate;
            int time;

            LOGGER.info("Enter Principle : ");
            principle=io.nextDouble();
            LOGGER.info("Enter Rate %: ");
            rate=io.nextDouble();
            LOGGER.info("Enter Time(years) : ");
            time=io.nextInt();

            Interest interest=new Interest(principle,rate,time);
            LOGGER.info("Simple Interest : "+interest.getSimpleInt());
            LOGGER.info("Compound Interest : "+interest.getCompoundInt());
        }
}
