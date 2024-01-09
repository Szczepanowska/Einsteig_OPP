package figuren;

import ack.shapes.Leinwand;

public class TagNacht {

  public static void main(String[] args) {
    Kreis gelb = new Kreis(100, 200, 40, "gelb");
    Kreis weiss = new Kreis(100, 200, 40, "weiss");
    Kreis mond = new Kreis(90, 200, 40, "schwarz");
    Kreis gruen = new Kreis(350, 250, 60, "gruen");
    Rechteck braun = new Rechteck(320, 310, 60, 200, "braun");
    Rechteck schwarz = new Rechteck(0,0, 1000,1000, "schwarz");

    Leinwand leinwand = new Leinwand();
    //Tag
    leinwand.zeichne(gelb);
    leinwand.zeichne(gruen);
    leinwand.zeichne(braun);

    leinwand.warte(300);
    gelb.verschieben(250, -100);
    leinwand.zeichne(gelb);

    leinwand.warte(300);
    gelb.verschieben(250, 100);
    leinwand.zeichne(gelb);


    //Nacht
    leinwand.warte(300);
    leinwand.zeichne(schwarz);
    leinwand.zeichne(gruen);
    leinwand.zeichne(braun);
    leinwand.zeichne(weiss);
    leinwand.zeichne(mond);

    leinwand.warte(300);
    weiss.verschieben(250, -100);
    mond.verschieben(250, -100);
    leinwand.zeichne(weiss);
    leinwand.zeichne(mond);


    leinwand.warte(300);
    weiss.verschieben(250, 100);
    mond.verschieben(250, 100);
    leinwand.zeichne(weiss);
    leinwand.zeichne(mond);


  }

}
