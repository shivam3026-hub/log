package Area;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class App
{

    private static Logger LOGGER = LogManager.getLogger(App.class);
    private static Scanner in=new Scanner(System.in);

    public enum Standards {
        standardMaterials,
        mediumStandardMaterials,
        highStandardMaterials;
    }
    public static void main( String[] args )
    {
        double area;
        String material;
        boolean automation = false;

        LOGGER.info("Enter the Area : ");
        area = in.nextDouble();
        LOGGER.info("Choose material Type: ");
        material = getMaterialType();

        if(material.toLowerCase().equals(Standards.highStandardMaterials.toString().toLowerCase())){
            LOGGER.info("Select automation (true/false) : ");
            automation = in.nextBoolean();
        }

        CalculateInterest calculateInterest = new CalculateInterest();
       if(calculateInterest.getInterest(area,material,automation)<0)
       {
           LOGGER.info("Invalid option");
       }
       else{
           LOGGER.info(calculateInterest.getInterest(area,material,automation));
      }
    }

    private static String getMaterialType(){
        Standards[] standards = Standards.values();
        for(int i=0;i<3;i++){
            System.out.println("Type '" + standards[i] + "' for " + standards[i]);
        }
        System.out.println("Input : ");
        String material = in.next();

        return material;
    }
}
