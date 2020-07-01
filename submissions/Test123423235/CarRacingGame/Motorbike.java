package CarRacingGame;

public class Motorbike extends Vehicle{

    //Attributes
    private double tiltAngle;

    //Constructors
    public Motorbike (double x, double y, double rotation){
        super(x,y,rotation);
    }

    public Motorbike(){
        super(0,0,0);
    }

    @Override
    public String toString(){
        return this.getClass() + " (x: " + this.positionX + " ) " + " (y: " + this.positionY + " )";
    }

    //Implements
    @Override
    public void render(){
        System.out.println( this );
        System.out.println( );
    }

}
