package CarRacingGame;

public class Car extends Vehicle{
    public Car(){
        super();
    }
    public Car (double x, double y, double rotation){
        super(x,y,rotation);
    }


    @Override
    public String toString(){
        return this.getClass() + " (x: " + this.positionX + " ) " + " (y: " + this.positionY + " )";
    }

    //Implement IRenderObject
    @Override
    public void render(){
        System.out.println (this);
        System.out.println ();
    }

}
