import java.util.Arrays;

public class PointArray implements Cloneable {
    private Point[] points;

    //constructor
    PointArray(Point[] points){
        this.points=points;
    }

    //getter
    public Point getPoint(int index) {
        return points[index];
    } 
    public Point[] getPoints(){
        return points;
    }

    //clone
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray)super.clone();
     }

     //deep copy
    public PointArray deepCopy() {
        Point[] newPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = new Point(points[i]); // uses copy constructor
        }
        return new PointArray(newPoints);
    }

    @Override
    public String toString() {
        return Arrays.toString(points);
    }
}
