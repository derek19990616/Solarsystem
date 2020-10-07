/**
 * This class contains the details of the Moon in the solar system
 * The orbiting of the Moon is with the Earth
 * @author Haochen Pan
 */
public class Moon{
    private double distance = 0;
    private double angle = 0;
    private double diameter = 5;
    private String col = "GREY";
    private double centreOfRotationDistance = 30;
    private double centreOfRotationAngle = 5;

    Earth earth = new Earth();
    
    /**
     * This enables user to retrieve the details of the Moon
     */
    public Moon(){

    }
    
    /**
     * A method called to get the relative distance of the Moon from the Earth
     * @return distance between the Moon and the Earth
     */
    public double getDistance(){

        setDistance();
        return this.distance;

    }
    
    /**
     * A method called to get the relative angular data of the Moons
     * @return angular data of the Moon
     */
    public double getAngle(){

        setAngle();
        return this.angle;

    } 
    
    /**
     * A method called to get the Diameter of the Moon
     * @return diameter of the Moon
     */
    public double getDiameter(){

        return this.diameter;

    }
    
    /**
     * A method called to get the Colour of the Moon
     * @return color of the Moon
     */
    public String getCol(){

        return this.col;

    }
    
    /**
     * A method called to get distance between the Moon and the Earthn
     * @return relative rotation distance between the Moon and the Earth
     */
    public double getCentreOfRotationDistance(){

        return this.centreOfRotationDistance;

    }
    
    /**
     * A method called to get the angular data between the Moon and the Earthn
     * @return relative angular data between the Moon and the Earthnh
     */
    public double getCentreOfRotationAngle(){

        setCentreOfRotationAngle(5);
        return this.centreOfRotationAngle;

    }
    
    /**
     * A method to sync the angular motion of the Moon with the Earth motion
     */
    public void setAngle(){

        this.angle = earth.getAngle();

    }
    
    /**
     * A method to sync the distance of the Moon with the Earth motion
     */
    public void setDistance(){

        this.distance = earth.getDistance();

    }

    /**
     * A method to set the rotating of the Moon
     * @param i the speed of the change in angular data
     */
    public void setCentreOfRotationAngle(double i){

        this.centreOfRotationAngle = this.centreOfRotationAngle + i;

    }
}