/**
 * This class contains the details of a moon orbiting the Jupiter
 */
public class Asteroid extends Planets{
     Jupiter jupiter = new Jupiter();
    
    /**
     * This enables user to retrieve the details of the Asteriod
     */
    public Asteroid(){
        super.setDistance(jupiter.getDistance());        
        super.setAngle(0);
        super.setDiameter(2.2);
        super.setColour("DARK_GREY");
        super.setCentreOfRotationAngle(0);
        super.setCentreOfRotationDistance(40);
        super.setSpeed(jupiter.getSpeed());
        super.setCentreOfRotationSpeed(1.25);

    }    
}
    
    