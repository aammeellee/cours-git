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

}
