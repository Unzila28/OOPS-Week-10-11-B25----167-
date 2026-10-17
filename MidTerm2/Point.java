import java.util.Random;
public class Point{
    private int x;
    private int y;
    private static Random rng=new Random();

    //constructor
    Point (int x , int y){
        this.x=x;
        this.y=y;
       
    }

    Point (Point other){
        this.x=other.x;
        this.y=other.y;
    }

    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    //setters
    public static void setX(int x){
        x=(int)rng.nextInt(1,101);
        }

     public static void setY(int y){
       y=rng.nextInt(1,101);
        }

        @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Point point = (Point) other;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

        public static void main(String[] args) {
            System.out.println(rng.nextInt(1,101));
        }
}