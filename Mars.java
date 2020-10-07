/**
 * This class contains the details of the Mars in the solar system
 * @author Haochen Pan
 */
public class Mars{
    private double distance = 200;
    private double angle = 0;
    private double diameter = 10;
    private String col = "RED";

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Mars(){

    }
    
    /**
     * A method called to get the relative distance of the Mars from the Sun
     * @return distance between the Sun and the Mars
     */
    public double getDistance(){

        return this.distance;

    }
    
    /**
     * A method called to get the relative angular data of the Mars
     * @return angular data of the Mars
     */
    public double getAngle(){
        
        setAngle(0.7);
        return this.angle;

    }  

    /**
     * A method called to get the Diameter of the Mars
     * @return diameter of the Mars
     */
    public double getDiameter(){

        return this.diameter;

    }
    
    /**
     * A method called to get the Colour of the Mars
     * @return color of the Mars
     */
    public String getCol(){

        return this.col;

    }

    /**
     * A method called to set and update the angle of the Mars
     * @param i the speed of change in angular data
     */
    public void setAngle(double i){

        this.angle = this.angle + i;

    }
}