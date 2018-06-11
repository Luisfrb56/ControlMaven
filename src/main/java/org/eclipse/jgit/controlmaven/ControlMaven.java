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
        try {

            

            // Me conecto a la pagina del tiempo

            Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();

            

            // Mostramos el titulo de dicha pagina

            System.out.println("Titulo de la página: " + doc.title());

            

            // recogemos la temperatura y el tiempo (ambos lo coge por el nombre de la clase, solo selecciona el 1º)

            Element temperatura = doc.select("div.today_nowcard-temp").first();

            Element descTiempo = doc.select("div.today_nowcard-phrase").first();

            

            // Muestro lo anterior recogido
            System.out.println("La temperatura: " + temperatura.text());

            System.out.println("El tiempo: " + descTiempo.text());

        } catch (IOException ex) {

            

            //Mensaje de error por algun motivo

            System.out.println("La conexion con la pagina ha fallado o no tienes conexion");

        }
    }
}
