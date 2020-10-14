/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Neptune extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Neptune(){
        super.setDistance(470);
        super.setDiameter(8);
        super.setColour("PINK");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(0.3);
        return super.getAngle();
    
}
}
    
   
   