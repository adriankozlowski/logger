package pl.sda;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
        static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        logger.addHandler(new FileHandler("logs.log",true));

        logger.log(Level.WARNING, "qwertyuio");
    }
}
