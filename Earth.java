/**
 * This class contains the details of the Earth in the solar system
 * @author Haochen Pan
 */
public class Earth extends Planets{

    /**
     * This enables user to retrieve the details of the Earth
     */
    public Earth(){
        super.setDistance(150);
        super.setDiameter(20);
        super.setColour("BLUE");
        super.setAngle(0);
        super.setSpeed(1.5);

    }
}