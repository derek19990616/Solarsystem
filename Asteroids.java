/**
 * This class contains the details of asteroids orbiting the Jupiter
 */
public class Asteroids{
    Asteroid asteriodOutter1 = new Asteroid();
    Asteroid asteriodOutter2 = new Asteroid();
    Asteroid asteriodOutter3 = new Asteroid();
    Asteroid asteriodOutter4 = new Asteroid();
    Asteroid asteriodInner1 = new Asteroid();
    Asteroid asteriodInner2 = new Asteroid();
    Asteroid asteriodInner3 = new Asteroid();
    Asteroid asteriodInner4 = new Asteroid();
    Asteroid asteriodBig1 = new Asteroid();
    Asteroid asteriodBig2 = new Asteroid();
    Asteroid asteriodBig3 = new Asteroid();
    Asteroid asteriodBig4 = new Asteroid();
   
    
   
    
    

    
    /**
     * This enables user to retrieve the details of the Asteriods
     */
    public Asteroids(){
        asteriodInner1.setCentreOfRotationAngle(0);
        asteriodInner2.setCentreOfRotationAngle(90);
        asteriodInner3.setCentreOfRotationAngle(180);
        asteriodInner4.setCentreOfRotationAngle(270);
        asteriodOutter1.setCentreOfRotationAngle(45);
        asteriodOutter2.setCentreOfRotationAngle(135);
        asteriodOutter3.setCentreOfRotationAngle(225);
        asteriodOutter4.setCentreOfRotationAngle(315);
        asteriodOutter1.setCentreOfRotationDistance(45);
        asteriodOutter2.setCentreOfRotationDistance(43);
        asteriodOutter3.setCentreOfRotationDistance(42);
        asteriodOutter4.setCentreOfRotationDistance(44);
        asteriodBig1.setCentreOfRotationAngle(30);
        asteriodBig2.setCentreOfRotationAngle(70);
        asteriodBig3.setCentreOfRotationAngle(150);
        asteriodBig4.setCentreOfRotationAngle(330);
        asteriodBig1.setDiameter(3.5);
        asteriodBig2.setDiameter(3);
        asteriodBig3.setDiameter(2.7);
        asteriodBig4.setDiameter(4);
    

    }    
}
    
    