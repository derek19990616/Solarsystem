/**
 * This class contains the details of the Earth in the solar system
 * @author Haochen Pan
 */
public class Earth extends Planets{
    public Earth(){
        super.setDistance(150);
        super.setDiameter(20);
        super.setColour("BLUE");
        super.setAngle(0);

    }

    public double updatedAngleWithAngularSpeed(){
        super.setAngle(1.5);
        return super.getAngle();
    
}
}