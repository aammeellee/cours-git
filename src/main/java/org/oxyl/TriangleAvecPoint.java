package org.oxyl;

public class TriangleAvecPoint {
    private Point point1;
    private Point point2;
    private Point point3;

    public TriangleAvecPoint(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public TriangleAvecPoint() {
        this.point1 = new Point(0.0, 0.0);
        this.point2 = new Point(0.0, 1.0);
        this.point3 = new Point(0.5, 0.5);
    }

    public TriangleAvecPoint(TriangleAvecPoint autre) {
        this(autre.point1, autre.point2, autre.point3);

    }

    public void deplacer(double distanceX, double distanceY) {
        this.point1.deplacer(distanceX, distanceY);
        this.point2.deplacer(distanceX, distanceY);
        this.point3.deplacer(distanceX, distanceY);
    }

    public void tourner(double thetaDegrees) {

        double barycentreX = (point1.getX() + point2.getX() + point3.getX()) / 3.0;
        double barycentreY = (point1.getY() + point2.getY() + point3.getY()) / 3.0;


        double thetaRadians = Math.toRadians(thetaDegrees);
        double cosTheta = Math.cos(thetaRadians);
        double sinTheta = Math.sin(thetaRadians);


        point1.tourner(barycentreX, barycentreY, cosTheta, sinTheta);

        point2.tourner(barycentreX, barycentreY, cosTheta, sinTheta);

        point3.tourner(barycentreX, barycentreY, cosTheta, sinTheta);
    }

    public boolean isEquilateral() {

        double cote1 = point1.calculerDistance(point2);
        double cote2 = point2.calculerDistance(point3);
        double cote3 = point3.calculerDistance(point1);


        double approxCote1 = Math.round(cote1 * 100.0) / 100.0;
        double approxCote2 = Math.round(cote2 * 100.0) / 100.0;
        double approxCote3 = Math.round(cote3 * 100.0) / 100.0;


        return approxCote1 == approxCote2 && approxCote2 == approxCote3;
    }

}
