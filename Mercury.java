/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Mercury extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Mercury(){
        super.setDistance(70);
        super.setDiameter(6);
        super.setColour("GRAY");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(2);
        return super.getAngle();
    
}
}
    
   
   