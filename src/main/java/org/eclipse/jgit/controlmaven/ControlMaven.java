package org.eclipse.jgit.controlmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import static org.jsoup.Jsoup.connect;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static sun.util.logging.LoggingSupport.log;
/*
*Creamos una aplicacion Maven y añadimos las dependecias del proyecto.
*/
public class ControlMaven {


    public static void main(String[] args) throws IOException {
      /*
        *Conectamos con la pagina web donde este recogio el tiempo.
        */
Document doc=Jsoup.connect("https://www.accuweather.com/es/es/spain-weather").get();


        
    
    }
    
}
