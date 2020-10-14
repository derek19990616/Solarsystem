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

        while(true){

            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            solarSystem.drawSolarObject(earth.getDistance(), earth.updatedAngleWithAngularSpeed(), earth.getDiameter(), earth.getColour());
            solarSystem.drawSolarObjectAbout(moon.getDistance(), moon.getAngle(), moon.getDiameter(), moon.getColour(), moon.getCentreOfRotationDistance(), moon.getCentreOfRotationAngle());
            solarSystem.drawSolarObject(mars.getDistance(), mars.updatedAngleWithAngularSpeed(), mars.getDiameter(), mars.getColour());
            solarSystem.drawSolarObject(mercury.getDistance(), mercury.updatedAngleWithAngularSpeed(), mercury.getDiameter(), mercury.getColour());
            solarSystem.drawSolarObject(venus.getDistance(), venus.updatedAngleWithAngularSpeed(), venus.getDiameter(), venus.getColour());
            solarSystem.drawSolarObject(saturn.getDistance(), saturn.updatedAngleWithAngularSpeed(), saturn.getDiameter(), saturn.getColour());
            solarSystem.drawSolarObject(uranus.getDistance(), uranus.updatedAngleWithAngularSpeed(), uranus.getDiameter(), uranus.getColour());
            solarSystem.drawSolarObject(neptune.getDistance(), neptune.updatedAngleWithAngularSpeed(), neptune.getDiameter(), neptune.getColour());
            solarSystem.drawSolarObject(jupiter.getDistance(), jupiter.updatedAngleWithAngularSpeed(), jupiter.getDiameter(), jupiter.getColour());

            solarSystem.finishedDrawing();

        }
    }
}