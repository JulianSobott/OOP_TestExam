package CarRacingGame;

public class Motorbike extends Vehicle{

    //Attributes
    private double tiltAngle;

    //Constructors
    public Motorbike (double x, double y, double rotation, double tiltAngle){
        super(x,y,rotation);
        this.tiltAngle = tiltAngle;

    }

    public Motorbike (){
        this(0,0,0,0);
    }

    public void setTiltAngle(double tiltAngle){
        this.tiltAngle = tiltAngle;
    }

    public double getTiltAngle(double tiltAngle){
        return this.tiltAngle;
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
