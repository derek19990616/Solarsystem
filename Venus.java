/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Venus extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Venus(){
        super.setDistance(100);
        super.setDiameter(20);
        super.setColour("MAGENTA");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(1.7);
        return super.getAngle();
    
}
}
    
   
   