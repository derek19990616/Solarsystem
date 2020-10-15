/**
 * This class contains the details of the Venus in the solar system
 * @author Haochen Pan
 */
public class Comet extends Planets{
    Jupiter jupiter = new Jupiter();
    
    /**
     * This enables user to retrieve the details of the Venus
     */
    public Comet(){
        super.setDistance(600);
        super.setDiameter(5);
        super.setColour("GRAY");
        super.setAngle(0);
        super.setSpeed(jupiter.getSpeed());
        super.setCentreOfRotationAngle(0);
        super.setCentreOfRotationDistance(20);
        super.setCentreOfRotationSpeed(0);

    }
    /**
     * A method used to get the updated distance between the moon and the planet
     * @return angle the updated rotation distance
     */
    public double updatedCentreOfRotationDistance(){

        if(super.getCentreOfRotationDistance() <= 20){
            super.updateCentreOfRotationDistance(5);

        }
        else if(super.getCentreOfRotationDistance() >= 200){
            super.updateCentreOfRotationDistance(-5);
        }
        else
            super.updateCentreOfRotationDistance(6);
        
        return super.getCentreOfRotationDistance();
        

    }
}
    
   
   