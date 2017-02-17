
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating city
        City lego = new City();
        //creating robot ruby, in lego city. it does not matter where the robot is created. it should always find its way back to the origin (0,0)
        Robot ruby = new Robot(lego, 4, -15, Direction.SOUTH);

        //if ruby is on a lower avenue number than avenue 0
        if (ruby.getAvenue() < 0) {
            //determine what direction it is faceing, and turn towards the origin
            if (ruby.getDirection() == Direction.NORTH) {
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.turnLeft();
            }
            if (ruby.getDirection() == Direction.SOUTH) {
                ruby.turnLeft();
            }
            if (ruby.getDirection() == Direction.WEST) {
                ruby.turnLeft();
                ruby.turnLeft();
            }
            //while ruby is on an avenue less than zero, it will move towards avenue 0
            while (ruby.getAvenue() < 0) {
                ruby.move();
            }
        }
        //if ruby is on a higher avenue number than 0
        if (ruby.getAvenue() > 0) {
            //determine what direction ruby is faceing, and turn towards the origin
            if (ruby.getDirection() == Direction.NORTH) {
                ruby.turnLeft();

            }
            if (ruby.getDirection() == Direction.EAST) {
                ruby.turnLeft();
                ruby.turnLeft();
            }
            if (ruby.getDirection() == Direction.SOUTH) {
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.turnLeft();
                //move across the avenues towards the origin
                while (ruby.getAvenue() > 0) {
                    ruby.move();
                }
            }
        }
        //if ruby is on a street number less than street 0
        if (ruby.getStreet() < 0) {
            //determine what direction ruby is faceing, and turn towards the origin
            if (ruby.getDirection() == Direction.NORTH) {
                ruby.turnLeft();
                ruby.turnLeft();

            }
            if (ruby.getDirection() == Direction.EAST) {
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.turnLeft();

            }
            if (ruby.getDirection() == Direction.WEST) {
                ruby.turnLeft();

            }
            //move across the streets towards the origin
            while (ruby.getStreet() < 0) {
                ruby.move();
            }
        }
        //if ruby is on a street number greater than street 0
        if (ruby.getStreet() > 0) {
            //determine what direction ruby is faceing, and turn towards the origin
            if (ruby.getDirection() == Direction.SOUTH) {
                ruby.turnLeft();
                ruby.turnLeft();

            }
            if (ruby.getDirection() == Direction.WEST) {
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.turnLeft();

            }
            if (ruby.getDirection() == Direction.EAST) {
                ruby.turnLeft();

            }
            //move across the streets towards the origin
            while (ruby.getStreet() > 0) {
                ruby.move();
            }
        }
    }
}
