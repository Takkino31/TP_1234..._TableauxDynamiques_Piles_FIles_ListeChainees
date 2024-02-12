public class Point {

    protected int x,y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,2);
        Point p3 = new Point(3,2);

        System.out.println("Point 1 et point 2 sont identiques ::::> " + p1.identical(p2)) ;
        System.out.println("Point 2 et point 3 sont identiques ::::> " + p2.identical(p3)) ;
        
    }

    public boolean identical(Point point){
        return (this.x == point.x) && (this.y == point.y);
    }
}