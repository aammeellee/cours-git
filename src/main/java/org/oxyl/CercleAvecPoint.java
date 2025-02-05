package org.oxyl;

public class CercleAvecPoint {

    //private double centreX,centreY;
    private Point centre;
    private double rayon;

    public CercleAvecPoint(Point centre, double rayon) {
        this.centre = centre;
        setRayon(rayon);
    }

    public CercleAvecPoint(double centreX, double centreY, double rayon) {
        //this.centreX = centreX;
        //this.centreY = centreY;
        this.centre = new Point(centreX, centreY);
        setRayon(rayon);
    }

    public CercleAvecPoint() {
        //this.centreX = 0.0;
        //this.centreY = 0.0;
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }

    public CercleAvecPoint( CercleAvecPoint copieCercle) {
        //this.centreX = copieCercle.centreX;
        //this.centreY = copieCercle.centreY;
        this.centre = copieCercle.centre;
        setRayon(copieCercle.rayon);
    }

    /** public double getCentreX() {
     return centreX;
     }
     public double getCentreY() {
     return centreY;
     } **/
    public Point getCentre() {
        return centre;
    }
    public double getRayon() {
        return rayon;
    }

    /** public void setCentreX(double centreX) {
     this.centreX = centreX;
     }
     public void setCentreY(double centreY) {
     this.centreY = centreY;
     } **/
    public void setCentre(double centreX, double centreY) {
        this.centre.setX( centreX );
        this.centre.setY( centreY );
    }
    public void setRayon(double rayon) {
        if (rayon > 0.0) {
            this.rayon = rayon;
        }
        else { this.rayon = 0.0; }
    }

    public void deplacer(double distanceX, double distanceY) {
        //this.centreX += distanceX;
        //this.centreY += distanceY;
        setCentre( centre.getX() + distanceX, centre.getY() + distanceY );
    }

    public boolean isGrand() {
        if (this.rayon > 100.0) {
            return true;
        }
        return false;
    }

    public void redimensionner(double f) {
        setRayon(this.rayon*f);
    }

    public void tourner(double theta) {
    }

}