package figuren;
import ack.shapes.Leinwand;

public class App {
    public static void main(String[] args) throws Exception {
      Rechteck rechteck1 = new Rechteck(100, 150, 70, 200, "blau");
      Kreis kreis1 = new Kreis(150, 100, 70, "gruen");
      Kreis kreis2 = new Kreis(400, 100, 40, "gelb");


      Leinwand leinwand = new Leinwand();

      leinwand.zeichne(rechteck1);
      // leinwand.zeichne(kreis1);
      // leinwand.zeichne(kreis2);

      leinwand.warte(2000);
      rechteck1.um90GradDrehen();
      leinwand.zeichne(rechteck1);
      leinwand.warte(1000);
      rechteck1.um90GradDrehen();
      leinwand.zeichne(rechteck1);
      leinwand.warte(1000);
      rechteck1.um90GradDrehen();
      leinwand.zeichne(rechteck1);
      leinwand.warte(1000);
      rechteck1.um90GradDrehen();
      leinwand.zeichne(rechteck1);
    }
}
