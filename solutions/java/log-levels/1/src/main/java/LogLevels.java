import java.util.ArrayList;
import java.util.Arrays;

public class LogLevels {
    public static String message(String logLine) {
        
        //int startPosition = logLine.indexOf("[ERROR]"); 
 
        String returnString; 
        String[] logLineArray = logLine.split(" ", 2);
        /*
        for (String x : logLineArray) {
            System.out.println(x); 
        }
        */
        return logLineArray[1].trim();



    }

    public static String logLevel(String logLine) {


    //int startPosition = logLine.indexOf("[ERROR]"); 
 
    String returnString; 
    String[] logLineArray = logLine.split(" ", 2); 
    /*
    for (String x : logLineArray) {
      System.out.println(x); 
    }
    */
    
    int startPosition  = logLineArray[0].indexOf("[") + 1; 
    int endPosition = logLineArray[0].indexOf("]"); 
    
        
    return logLineArray[0].substring(startPosition, endPosition).trim().toLowerCase();
    // this is currenlty returning "[error]:"
    // but we are expecting "error"
    
        
    

        
    }

    public static String reformat(String logLine) {

        /*
        String returnString; 
        String[] logLineArray = logLine.split(" ", 2);
        
        /*
        for (String x : logLineArray) {
            System.out.println(x); 
        }
        

        //String[] reverseString;
        ArrayList<String> reverseStringArrayList;
    
        //String[] returnArray; 
          
        for (int i = logLineArray.length; i >= 0; i-- ) {
            reverseStringArrayList.add(logLineArray[i]);
            String[] returnArray = reverseStringArrayList.toArray(new String[0]);
            return returnArray[0]; 
        }

        //return returnArray[0]; 

        */

        String returnString =  message(logLine) + " (" + logLevel(logLine) + ")"; 
        return returnString; 
        

        
    }
}
