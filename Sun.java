/**
 * This class contains the details of the Sun in the solar system
 * @author Haochen Pan
 */
public class Sun{
    private double distance = 0;
    private double angle = 0;
    private double diameter = 50;
    private String col = "YELLOW";

    /**
     * This enables user to retrieve the details of the Sun
     */
    public Sun(){

    }

    /**
     * A method called to get the relative distance of the Sun
     * @return distance of the sun
     */
    public double getDistance(){

        return this.distance;

    }
    
    /**
     * A method called to get the relative angular data of the Sun
     * @return angular data of the Sun
     */
    public double getAngle(){

        return this.angle;

    }
    
    /**
     * A method called to get the Diameter of the Sun
     * @return diameter of the Sun
     */
    public double getDiameter(){

        return this.diameter;

    }
    
    /**
     * A method called to get the Colour of the Sun
     * @return color of the Sun
     */
    public String getCol(){

        return this.col;
    }
}