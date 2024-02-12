class TestPoint {


    
    public static void main (String args[]){
        Point P1 = new Point(2,3);
        Point P2 = new Point(6,8);
        Point P3 = new Point(P2);
        System.out.println("Distance entre P1 et P2 " + P1.distance(P2));
        System.out.println("Distance entre P1 et 9,1 " + P1.distance(9,1));
        System.out.println("Distance entre P1 et P3 " + P1.distance(P3));
        System.out.println("Distance entre P1(1,2) et P2(-1,-1) " + Point.distance(1,2,-1,-1));

        P3.deplacer(2,3);
        System.out.println("Nouvelle position de P3b: " + P3);
        
        P3.translater(1,1);
        System.out.println("Nouvelle position de P3 translaté : " + P3);
    }

}