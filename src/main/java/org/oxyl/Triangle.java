package org.oxyl;
import java.text.DecimalFormat;

public class Triangle {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }

    public Triangle() {
        this(0.0,0.0,0.0,1.0,0.5,0.5);
    }

    public Triangle(Triangle autre) {
        this(autre.x1, autre.y1, autre.x2, autre.y2, autre.x3, autre.y3);
    }

    public void deplacer(double distanceX, double distanceY){
        this.x1 += distanceX;
        this.x2 += distanceX;
        this.x3 += distanceX;
        this.y1 += distanceY;
        this.y2 += distanceY;
        this.y3 += distanceY;
    }

    public void tourner(double theta) {
        double barycentreX = (this.x1 + this.x2 + this.x3) / 3.0;
        double barycentreY = (this.y1 + this.y2 + this.y3) / 3.0;

        double thetaRad = Math.toRadians(theta);

        double x1 = barycentreX + (this.x1-barycentreX) * Math.cos(thetaRad) - (this.y1-barycentreY) * Math.sin(thetaRad);
        double x2 = barycentreX + (this.x2-barycentreX) * Math.cos(thetaRad) - (this.y2-barycentreY) * Math.sin(thetaRad);
        double x3 = barycentreX + (this.x3-barycentreX) * Math.cos(thetaRad) - (this.y3-barycentreY) * Math.sin(thetaRad);
        double y1 = barycentreY + (this.x1-barycentreX) * Math.sin(thetaRad) + (this.y1-barycentreY) * Math.cos(thetaRad);
        double y2 = barycentreY + (this.x2-barycentreX) * Math.sin(thetaRad) + (this.y2-barycentreY) * Math.cos(thetaRad);
        double y3 = barycentreY + (this.x3-barycentreX) * Math.sin(thetaRad) + (this.y3-barycentreY) * Math.cos(thetaRad);

        this.x1 = Math.round(x1*100.0) / 100.0;
        this.y1 = Math.round(y1*100.0) / 100.0;
        this.x2 = Math.round(x2*100.0) / 100.0;
        this.y2 = Math.round(y2*100.0) / 100.0;
        this.x3 = Math.round(x3*100.0) / 100.0;
        this.y3 = Math.round(y3*100.0) / 100.0;

    }
    public boolean isEquilateral() {
        double cote12 = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        double cote23 = Math.sqrt(Math.pow(this.x3 - this.x2, 2) + Math.pow(this.y3 - this.y2, 2));
        double cote31 = Math.sqrt(Math.pow(this.x1 - this.x3, 2) + Math.pow(this.y1 - this.y3, 2));

        cote12 = Math.round(cote12*100.0) / 100.0;
        cote23 = Math.round(cote23*100.0) / 100.0;
        cote31 = Math.round(cote31*100.0) / 100.0;

        return cote12 == cote23 && cote31 == cote23;
}



}
