class PointColore extends Point{
    
    public byte color;

    public PointColore(int x, int y, byte color){
        super(x,y);
        this.color = color;
    }

    public boolean identical(PointColore pc){
        return (this.x == pc.x) && (this.y == pc.y) && (this.color == pc.color) ;
    }

      public static void main(String[] args) {
        Point pc1=new PointColore (3,4, (byte) 5);
        Point pc2=new PointColore (3,4, (byte) 6);
        System.out.println("Point 1  x ::: " + pc1.x) ;
        System.out.println("Point 1  y ::: " + pc1.x) ;
        System.out.println("Point 1  color ::: " + pc1.y) ;

        System.out.println("Point 2  x ::: " + pc2.x) ;
        System.out.println("Point 2  y ::: " + pc2.x) ;
        System.out.println("Point 2  color ::: " + pc2.y) ;
        
        

        System.out.println("Point 1 et point 2 colorées ne sont pas identiques :::: " + pc1.identical(pc2)) ;
        
        // Sous Classement
        PointColore pc_1=new PointColore (3,4, (byte) 5);
        PointColore pc_2=new PointColore (3,4, (byte) 6);
        System.out.println("Point 1 et point 2 colorées sont identiques :::: " + pc_1.identical(pc_2)) ;

        // this.egalite = identical(p1,p2);
        // System.out.println(this.egalite) ;
        
       
    }
}