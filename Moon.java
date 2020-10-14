/**
 * This class contains the details of the Moon in the solar system
 * The orbiting of the Moon is with the Earth
 * @author Haochen Pan
 */
public class Moon extends Planets{
    

    Earth earth = new Earth();
    
    /**
     * This enables user to retrieve the details of the Moon
     */
    public Moon(){
        super.setAngle(earth.getAngle());
        super.setDistance(earth.getDistance());
        super.setColour("DARK_GRAY");
        super.setCentreOfRotationAngle(5);
        super.setCentreOfRotationDistance(30);


    }
    
   public double updatedAngleWithAngularSpeed(){
        super.setAngle(earth.getAngle());
        return super.getAngle();
    }

    public double updatedDistanceWithSpeed(){
        super.setDistance(earth.getDistance());
        return super.getDistance();
    }
    
    
   
    
   
    
   
    
    /**
     * A method called to get the angular data between the Moon and the Earthn
     * @return relative angular data between the Moon and the Earthnh
     */
    public double getCentreOfRotationAngle(){

        super.setCentreOfRotationAngle(5);
        return super.getCentreOfRotationAngle();

    }
    
    /**
     * A method to sync the angular motion of the Moon with the Earth motion
     */
    

    
}