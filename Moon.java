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
        super.setCentreOfRotationAngle(5);
        super.setCentreOfRotationDistance(30);

    }
    
   
    /**
     * A method called to get the angular data between the Moon and the Earthn
     * @return relative angular data between the Moon and the Earthnh
     */
    public double getCentreOfRotationAngle(){

        super.setCentreOfRotationAngle(10);
        return super.getCentreOfRotationAngle();

    }
    public double getDistance(){
        return earth.getDistance();
    }
    public double updatedAngleWithAngularSpeed(){
        super.setAngle(earth.getAngle());
        return super.getAngle();
    }
}
    
    