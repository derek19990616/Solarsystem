/**
 * This is the abstract class which contains all the details of 
 */
public abstract class Planets{
    private double distance;  //Distance between the Sun and the Planet
    private double angle;     //Angle between the planet and the Sun
    private double diameter;  //Diameter of the planet
    private String col;       //Colour of the planet
    private double centreOfRotationDistance; //Distance between the moon and the planet
    private double centreOfRotationAngle;    //Angle between the moon and the planet
    private double speed;                    //Angular motion between the planet ad the Sun
    private double centreOfRotationSpeed;    //Angular speed between the moon and the planet

    /**
     * This enables user to retrieve the details of the Planets
     */
    public Planets(){

    }
    
    /**
     * A method called to get the relative distance of the Planet from the Sun
     * @return distance between the Sun and the Planet
     */
    public double getDistance(){

        return this.distance;

    }
    
    /**
     * A method called to set the Angular motion speed between the planet and the Sun;
     * @param speed the speed
     */
    public void setSpeed(double speed){
        this.speed = speed;
    }

    /**
     * A method called to set the Angular motion speed between the planet and the Sun;
     * @return the speed of the angular motion
     */
    public double getSpeed(){
        return this.speed;
    }

    /**
     * A method called to set the distance between the planet and the Sun;
     * @param distance the distance
     */
    public void setDistance(double distance){
        this.distance = distance;
    }

    /**
     * A method called to set the diameter of the planet
     * @param diameter the diameter
     */
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    
    /**
     * A method called to get the relative angular data of the Mars
     * @return angular data of the Mars
     */
    public double getAngle(){
        
       
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
    public String getColour(){

        return this.col;

    }

    /**
     * A method called to set and update the angle of the Mars
     * @param i the speed of change in angular data
     */
    public void setAngle(double angle){

        this.angle = angle;

    }
    /**
     * A method called to set and update the angle of the Mars
     * @param i the speed of change in angular data
     */
    public void updateAngle(double i){

        this.angle = this.angle + i;

    }
    /**
     * A method to set the coloour of the planet
     * @param col the colour of the planet
     */
    public void setColour(String col){

        this.col = col;
    }
    
    /**
     * A method used to get the updated angle between the sun and the planet
     * @return angle the updated angle
     */
    public double updatedAngleWithAngularSpeed(){

        updateAngle(getSpeed());
        return this.angle;
    }

    /**
     * A method used to set the rotation speed between the moon and the planet
     * @param centreOfRotationSpeed the rotation speed of the moon
     */
    public void setCentreOfRotationSpeed(double centreOfRotationSpeed){

        this.centreOfRotationSpeed = centreOfRotationSpeed;
    }
    
    /**
     * A method used to increment the rotation distance with value i
     * @param i amount of value goes to increment
     */
    public void updateCentreOfRotationSpeed(double i){

        this.centreOfRotationSpeed = this.centreOfRotationSpeed + i;
    }
     
    /**
     * A method used to get the rotation speed between the moon and the planet
     * @return centreOfRotationSpeed the rotation speed
     */
    public double getCentreOfRotationSpeed(){

        return this.centreOfRotationSpeed;

    }

    /**
     * A method used to get the updated angle between the moon and the planet
     * @return angle the updated rotation angle
     */
    public double updatedCentreOfRotationAngle(){
        updateCentreOfRotationAngle(getCentreOfRotationSpeed());
        return getCentreOfRotationAngle();

    }
    
    /**
     * A method used to get the updated distance between the moon and the planet
     * @return angle the updated rotation distance
     */
    public double updatedCentreOfRotationDistance(){
        updateCentreOfRotationDistance(0);
        return getCentreOfRotationDistance();

    }
    /**
     * A method used to get the rotation distance between the moon and the planet
     * @return centreOfRotationSpeed the rotation distance
     */
    public double getCentreOfRotationDistance(){

        return this.centreOfRotationDistance;

    }

    /**
     * A method used to set the angle between the moon and the planet
     * @param centreOfRotationAngle the angle between the moon and the planet
     */
    public void setCentreOfRotationAngle(double centreOfRotationAngle){

        this.centreOfRotationAngle = centreOfRotationAngle;

    }
    
    /**
     * A method used to increment the rotation distance with value i
     * @param i amount of value goes to increment
     */
    public void updateCentreOfRotationAngle(double i){

        this.centreOfRotationAngle = this. centreOfRotationAngle + i;

    }

    /**
     * A method used to get the rotation distance between the moon and the planet
     * @return centreOfRotationAngle the rotation distance
     */
    public double getCentreOfRotationAngle(){

        
        return this.centreOfRotationAngle;

    }

    /**
     * A method used to set the distance between the moon and the planet
     * @param centreOfRotationDistance the distance between the moon and the planet
     */
    public void setCentreOfRotationDistance(double centreOfRotationDistance){

        this.centreOfRotationDistance = centreOfRotationDistance;

    }
    
    /**
     * A method used to increment the rotation distance with value i
     * @param i amount of value goes to increment
     */
    public void updateCentreOfRotationDistance(double i){

        this.centreOfRotationDistance = this.centreOfRotationDistance + i;

    }

    
}