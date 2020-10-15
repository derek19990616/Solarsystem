/**
 * This class contains the details of a moon orbiting the Earth
 */
public class Moon extends Planets{
     Earth earth = new Earth();
    
    /**
     * This enables user to retrieve the details of the Moon
     */
    public Moon(){
        super.setDistance(0);        
        super.setAngle(0);
        super.setDiameter(5);
        super.setColour("GREY");
        super.setCentreOfRotationAngle(0);
        super.setCentreOfRotationDistance(30);
        super.setSpeed(earth.getSpeed());
        super.setCentreOfRotationSpeed(5);

    }    
    /**
     * A method called to sync the distance the Moon with the Earth between the sun and themselves;
     * @return relative distance between the Moon and the Sun
     */
    public double getDistance(){
        return earth.getDistance();
    }
}
    
    