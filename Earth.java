/**
 * This class contains the details of the Earth in the solar system
 * @author Haochen Pan
 */
public class Earth{
    private double distance = 150;
    private double angle = 5;
    private double diameter = 20;
    private String col = "BLUE";
   
    /**
     * This enables user to retrieve the details of the Earth
     */
    public Earth(){

    }
    
    /**
     * A method called to get the relative distance of the Earth from the Sun
     * @return distance between the Sun and the Earth
     */
    public double getDistance(){

        return this.distance;

    }
    
    /**
     * A method called to get the relative angular data of the Earth
     * @return angular data of the Earth
     */
    public double getAngle(){
        
        setAngle(1);
        return this.angle;

    }

    /**
     * A method called to get the Diameter of the Earth
     * @return diameter of the Earth
     */
    public double getDiameter(){

        return this.diameter;

    }
    
    /**
     * A method called to get the Colour of the Earth
     * @return color of the Earth
     */
    public String getCol(){

        return this.col;

    }
    
    /**
     * A method called to set and update the angle of the Earth
     * @param i the speed of change in angular data
     */
    public void setAngle(double i){

        this.angle = this.angle + i;

    }
}