
public class Cylinder {

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }//TODO; what does protected mean?

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "(radius, height): (" + radius + "," + height + ")";
    }

}
