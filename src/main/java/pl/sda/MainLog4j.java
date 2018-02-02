package pl.sda;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLog4j {

    private static final Logger log = LogManager.getLogger(MainLog4j.class);

    public static void main(String[] args) {
        log.debug("4444444");
    }
}
