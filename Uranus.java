/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Uranus extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Uranus(){
        super.setDistance(450);
        super.setDiameter(9);
        super.setColour("White");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(0.5);
        return super.getAngle();
    
}
}
    
   
   