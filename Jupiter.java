/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Jupiter extends Planets{
    
   

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Jupiter(){
        super.setDistance(300);
        super.setDiameter(50);
        super.setColour("ORANGE");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(1);
        return super.getAngle();
    
}
}
    
   
   