public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle r = (Rectangle) obj;
            if (this.width == r.width && this.height == r.height) {
                return true;
            }
        }
        return false;
    }
}
