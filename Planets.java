public abstract class Planets{
    private double distance;
    private double angle;
    private double diameter;
    private String col;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;

    /**
     * This enables user to retrieve the details of the Mars
     */
    public Planets(){

    }
    
    /**
     * A method called to get the relative distance of the Mars from the Sun
     * @return distance between the Sun and the Mars
     */
    public double getDistance(){

        return this.distance;

    }

    public void setDistance(double distance){
        this.distance = distance;
    }

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
    public void setAngle(double i){

        this.angle = this.angle + i;

    }

    public void setColour(String col){
        this.col = col;
    }

    public double updatedAngleWithAngularSpeed(){
        setAngle(0);
        return this.angle;
    }
    public double updatedDistanceWithSpeed(){
        setDistance(0);
        return this.distance;
    }

    public double getCentreOfRotationDistance(){

        return this.centreOfRotationDistance;

    }
    public void setCentreOfRotationAngle(double i){

        this.centreOfRotationAngle = this.centreOfRotationAngle + i;

    }
    public double getCentreOfRotationAngle(){

        
        return this.centreOfRotationAngle;

    }
    public void setCentreOfRotationDistance(double i){

        this.centreOfRotationDistance = this.centreOfRotationDistance + i;

    }
    
}