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

        SolarSystem solarSystem = new SolarSystem(500, 500);
        Sun sun = new Sun();
        Earth earth = new Earth();
        Moon moon = new Moon();
        Mars mars = new Mars();

        while(true){

            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getCol());
            solarSystem.drawSolarObject(earth.getDistance(), earth.getAngle(), earth.getDiameter(), earth.getCol());
            solarSystem.drawSolarObjectAbout(moon.getDistance(), moon.getAngle(), moon.getDiameter(), moon.getCol(), moon.getCentreOfRotationDistance(), moon.getCentreOfRotationAngle());
            solarSystem.drawSolarObject(mars.getDistance(), mars.getAngle(), mars.getDiameter(), mars.getCol());
            solarSystem.finishedDrawing();

        }
    }
}