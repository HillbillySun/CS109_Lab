

public class Rectangle extends Shape{
	private double width;
	private double height;
//
//	public Rectangle(double x, double y) {
//		super(x, y);
//	}
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void checkColor() {
		if (isInBoundary()) {
			super.setColor(ShapeColor.GREEN);
		} else {
			super.setColor(ShapeColor.RED);
		}
	}

	public boolean isInBoundary() {
		if (-1 * getScreenSize() > super.getX() - this.width / 2 || getScreenSize() < super.getX() + this.width / 2) {
			return false;
		}
		if (-1 * getScreenSize() > super.getY() - this.height / 2 || getScreenSize() < super.getY() + this.height / 2) {
			return false;
		}
		return true;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", height=" + height + " x=" + super.getX() +
				", y=" + super.getY() +
				", color=" + super.getColor() +
				"}\n";
	}

	public void draw() {
		StdDraw.setPenColor(super.getColor().getColor());
		StdDraw.filledRectangle(super.getX(), super.getY(), this.width / 2, this.height / 2);
	}
}
