public class Circle extends Shape{
    private double radius;
    static final int DEFAULT_RADIUS = 5;

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;
    }

    public Circle(double x, double y) {
        super(x, y);
        this.radius = DEFAULT_RADIUS;
    }
    public void checkColor() {
        if (isInBoundary()) {
            super.setColor(ShapeColor.GREEN);
        } else {
            super.setColor(ShapeColor.RED);
        }
    }
    public boolean isInBoundary() {
        if (-1 * getScreenSize() > super.getX() - this.radius || getScreenSize() < super.getX() + this.radius) {
            return false;
        }
        if (-1 * getScreenSize() > super.getY() - this.radius || getScreenSize() < super.getY() + this.radius) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + " x=" + super.getX() +
                ", y=" + super.getY() +
                ", color=" + super.getColor() +
                "}\n";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        StdDraw.setPenColor(super.getColor().getColor());
        StdDraw.filledCircle(super.getX(), super.getY(), radius);
    }
}