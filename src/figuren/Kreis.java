package figuren;
public class Kreis {

  public static final int PositionX = 0;
  int positionX;
  int positionY;
  int radius;
  String farbe;

  Kreis(){

  }

  public int getPositionX() {
    return this.positionX;
  }

  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  public int getPositionY() {
    return this.positionY;
  }

  public void setPositionY(int positionY) {
    this.positionY = positionY;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    if (radius <= 0){
      System.out.println("Wert nicht erlaubt");
    } else {
        this.radius = radius;
    }
  }

  public String getFarbe() {
    return this.farbe;
  }

  public void setFarbe(String farbe) {
    this.farbe = farbe;
  }

  public Kreis(int positionX, int positionY, int radius, String farbe){
    this.positionX = positionX;
    this.positionY = positionY;
    this.radius = radius;
    this.farbe = farbe;
  }



  public void verschieben(int xRichtung, int yRichtung){
    positionX += xRichtung;
    positionY += yRichtung;
  }

  public void vergroessern(int zusaetzlicherRadius){
    radius *= zusaetzlicherRadius;
  }

  public double flaecheninhaltBerechnen(){
    return Math.PI * Math.pow(radius, 2);
  }

  public double umfangBerechnen(){
    return 2 * Math.PI * radius;
  }

}
