import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

/**
 * This class demonstrates a graphical user interface to a model of the solar system
 * @author Haochen Pan
 */

public class MainPanel{
        
    /**
     * This is the main which demonstrates each planet in a solar system and added them in the GUI
     * It enables rotation of planets in a solar system respectively in various speed
     */
    public static void main(String[] args){
        SolarSystem solarSystem = new SolarSystem(1920, 1080);
        solarSystem.speedFrame = 10;
        Sun sun = new Sun();
        Earth earth = new Earth();
        Moon moon = new Moon();
        Mars mars = new Mars();
        Mercury mercury = new Mercury();
        Venus venus = new Venus();
        Saturn saturn = new Saturn();
        Uranus uranus = new Uranus();
        Neptune neptune = new Neptune();
        Jupiter jupiter = new Jupiter();
        Asteroids asteroids = new Asteroids(); //Contains all the invididual asteroids' data
      
        
        while(true){

            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            solarSystem.drawSolarObject(earth.getDistance(), earth.updatedAngleWithAngularSpeed(), earth.getDiameter(), earth.getColour());
            solarSystem.drawSolarObjectAbout(moon.getDistance(), moon.updatedAngleWithAngularSpeed(), moon.getDiameter(), moon.getColour(), moon.getCentreOfRotationDistance(), moon.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObject(mars.getDistance(), mars.updatedAngleWithAngularSpeed(), mars.getDiameter(), mars.getColour());
            solarSystem.drawSolarObject(mercury.getDistance(), mercury.updatedAngleWithAngularSpeed(), mercury.getDiameter(), mercury.getColour());
            solarSystem.drawSolarObject(venus.getDistance(), venus.updatedAngleWithAngularSpeed(), venus.getDiameter(), venus.getColour());
            solarSystem.drawSolarObject(saturn.getDistance(), saturn.updatedAngleWithAngularSpeed(), saturn.getDiameter(), saturn.getColour());
            solarSystem.drawSolarObject(uranus.getDistance(), uranus.updatedAngleWithAngularSpeed(), uranus.getDiameter(), uranus.getColour());
            solarSystem.drawSolarObject(neptune.getDistance(), neptune.updatedAngleWithAngularSpeed(), neptune.getDiameter(), neptune.getColour());
            solarSystem.drawSolarObject(jupiter.getDistance(), jupiter.updatedAngleWithAngularSpeed(), jupiter.getDiameter(), jupiter.getColour());
            
            /**
             * The following part is the individual asteroid
             */
            solarSystem.drawSolarObjectAbout(asteroids.asteriodInner1.getDistance(), asteroids.asteriodInner1.updatedAngleWithAngularSpeed(), asteroids.asteriodInner1.getDiameter(), asteroids.asteriodInner1.getColour(), asteroids.asteriodInner1.getCentreOfRotationDistance(), asteroids.asteriodInner1.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodInner2.getDistance(), asteroids.asteriodInner2.updatedAngleWithAngularSpeed(), asteroids.asteriodInner2.getDiameter(), asteroids.asteriodInner2.getColour(), asteroids.asteriodInner2.getCentreOfRotationDistance(), asteroids.asteriodInner2.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodInner3.getDistance(), asteroids.asteriodInner3.updatedAngleWithAngularSpeed(), asteroids.asteriodInner3.getDiameter(), asteroids.asteriodInner3.getColour(), asteroids.asteriodInner3.getCentreOfRotationDistance(), asteroids.asteriodInner3.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodInner4.getDistance(), asteroids.asteriodInner4.updatedAngleWithAngularSpeed(), asteroids.asteriodInner4.getDiameter(), asteroids.asteriodInner4.getColour(), asteroids.asteriodInner4.getCentreOfRotationDistance(), asteroids.asteriodInner4.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodOutter1.getDistance(), asteroids.asteriodOutter1.updatedAngleWithAngularSpeed(), asteroids.asteriodOutter1.getDiameter(), asteroids.asteriodOutter1.getColour(), asteroids.asteriodOutter1.getCentreOfRotationDistance(), asteroids.asteriodOutter1.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodOutter2.getDistance(), asteroids.asteriodOutter2.updatedAngleWithAngularSpeed(), asteroids.asteriodOutter2.getDiameter(), asteroids.asteriodOutter2.getColour(), asteroids.asteriodOutter2.getCentreOfRotationDistance(), asteroids.asteriodOutter2.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodOutter3.getDistance(), asteroids.asteriodOutter3.updatedAngleWithAngularSpeed(), asteroids.asteriodOutter3.getDiameter(), asteroids.asteriodOutter3.getColour(), asteroids.asteriodOutter3.getCentreOfRotationDistance(), asteroids.asteriodOutter3.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodOutter4.getDistance(), asteroids.asteriodOutter4.updatedAngleWithAngularSpeed(), asteroids.asteriodOutter4.getDiameter(), asteroids.asteriodOutter4.getColour(), asteroids.asteriodOutter4.getCentreOfRotationDistance(), asteroids.asteriodOutter4.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodBig1.getDistance(), asteroids.asteriodBig1.updatedAngleWithAngularSpeed(), asteroids.asteriodBig1.getDiameter(), asteroids.asteriodBig1.getColour(), asteroids.asteriodBig1.getCentreOfRotationDistance(), asteroids.asteriodBig1.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodBig2.getDistance(), asteroids.asteriodBig2.updatedAngleWithAngularSpeed(), asteroids.asteriodBig2.getDiameter(), asteroids.asteriodBig2.getColour(), asteroids.asteriodBig2.getCentreOfRotationDistance(), asteroids.asteriodBig2.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodBig3.getDistance(), asteroids.asteriodBig3.updatedAngleWithAngularSpeed(), asteroids.asteriodBig3.getDiameter(), asteroids.asteriodBig3.getColour(), asteroids.asteriodBig3.getCentreOfRotationDistance(), asteroids.asteriodBig3.updatedCentreOfRotationAngle());
            solarSystem.drawSolarObjectAbout(asteroids.asteriodBig4.getDistance(), asteroids.asteriodBig4.updatedAngleWithAngularSpeed(), asteroids.asteriodBig4.getDiameter(), asteroids.asteriodBig4.getColour(), asteroids.asteriodBig4.getCentreOfRotationDistance(), asteroids.asteriodBig4.updatedCentreOfRotationAngle());
            
            

            solarSystem.finishedDrawing();
        }

        
    }
}