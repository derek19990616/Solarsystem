/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Saturn extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Saturn(){
        super.setDistance(400);
        super.setDiameter(40);
        super.setColour("CYAN");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(0.8);
        return super.getAngle();
    
}
}
    
   
   