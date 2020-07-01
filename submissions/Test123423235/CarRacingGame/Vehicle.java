package CarRacingGame;

public abstract class Vehicle implements IRenderObject, IControllable{
    //Attributes
    protected double rotation;
    protected double positionX;
    protected double positionY;

    //Constructors
    public Vehicle (double x, double y, double rotation){
        this. rotation = rotation;
        this. positionX = x;
        this. positionY = y;
    }

    //Getters
    public double getPositionX(){
        return this. positionX;
    }

    public double getPositionY(){
        return this. positionY;
    }

    public double getRotation(){
        return this. rotation;
    }

    //Setters
    public void setPositionX ( double x ){
        this.positionX = x;
    }

    public void setPositionY ( double y ){
        this.positionY = y;
    }

    public void setRotation ( double rotation ){
        this.rotation = rotation;
    }

    @Override
    public boolean equals (Object obj) {
        if ( obj instanceof Vehicle ){
           Vehicle a = (Vehicle)obj;
           return ( a.positionX == this.positionX ) && ( a.positionY == this.positionY );
        }
        else{
            return false;
        }
    }

    //Implement IControllable

    @Override
    public void turnLeft (double degree){
        this.rotation = (rotation - degree) % 360;
    }

    @Override
    public void turnRight (double degree){
        this.rotation = (rotation + degree) % 360;
    }

    @Override
    public void moveForward (double distance){
        double deltaX ;
        double deltaY ;
        //Sin and Cos are using radiant, to convert Math.toRadians
        deltaX = Math.cos( Math.toRadians(rotation) ) * distance;
        deltaY = Math.sin( Math.toRadians(rotation) ) * distance;

        this.positionX = positionX - deltaX;
        this.positionY = positionY - deltaY;

    }

    @Override
    public void moveBackward (double distance){
        moveForward(-distance);
    }

}
