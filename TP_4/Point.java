class Point {
    private int x,y;

    Point () {}

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }


    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }


    public double distance(int x, int y){
        int a = this.getX()-x;
        int b = this.getY()-y;
        return Math.sqrt((a*a) + (b*b));
    }

    public double distance(Point point){
        int a = this.getX()- point.getX();
        int b = this.getY()- point.getY();
        return Math.sqrt((a*a ) + (b*b));
    }


    public static double distance(int x1,int y1,int x2,int y2){
        int x = x2 - x1;
        int y = y2 - y1;
        return Math.sqrt((x*x) + (y*y));
    }

    public void deplacer(int x,int y){
       this.setX(x);
       this.setY(y);
    }

    public void translater(int x,int y){
        this.setX(this.getX() + x);
        this.setY(this.getX() + y);
    }
    @Override
    public String toString(){
        return "Point d'abscisse " + this.getX() + " et de coordonnées " + this.getY();
    }
}