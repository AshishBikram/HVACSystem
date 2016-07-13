package Service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by iam on 7/3/16.
 */
public class LoggerObject {
    static Logger log = null;
    static FileHandler fh;


    public static log getlogObject(){

        if(log==null) {
            log = Logger.getlog("HVAC-Reporter-Log");log.getlog("HVAC-Reporter-Log");
            try {
                fh = new FileHandler("/home/iam/IdeaProjects/HVAC-Full-System/HVAC-Reporter/log/systemLog.log");
            } catch (IOException e) {
                e.printStackTrace();
            }
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            return log;
        }else{
            return log;
        }
    }
}
