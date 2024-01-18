package figuren;

import ack.shapes.Leinwand;

public class Ampel {
  private Rechteck gehaeuse;
  private Kreis gruenerKreis, gelberKreis, roterKreis;

  int positionX, positionY, breite;


  public Ampel(int positionX, int positionY, int breite){
    int r = breite/2;
    gehaeuse = new Rechteck(positionX,positionY,breite,3*breite, "schwarz");
    gruenerKreis = new Kreis(positionX + r, positionY + r+ 2*breite, r,"gruen");
    gelberKreis = new Kreis(positionX + r,positionY + r + breite, r,"gelb");
    roterKreis = new Kreis(positionX + r,positionY + r, r,"rot");
  }

  public Ampel(){
    this(50,50,100);
  }

  public void zeichne(Leinwand leinwand){
    leinwand.zeichne(gehaeuse);
    leinwand.zeichne(roterKreis);
    leinwand.warte(1000);
    leinwand.zeichne(gehaeuse);
    leinwand.zeichne(gelberKreis);
    leinwand.warte(1000);
    leinwand.zeichne(gehaeuse);
    leinwand.zeichne(gruenerKreis);
    leinwand.warte(1000);
  }
}
