
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City lego = new City();
        //new robot
        Robot ruby = new Robot(lego, 1, 1, Direction.EAST);
        //new row of ten things
        new Thing(lego, 1, 2);
        new Thing(lego, 1, 3);
        new Thing(lego, 1, 4);
        new Thing(lego, 1, 5);
        new Thing(lego, 1, 6);
        new Thing(lego, 1, 7);
        new Thing(lego, 1, 8);
        new Thing(lego, 1, 9);
        new Thing(lego, 1, 10);
        new Thing(lego, 1, 11);
        //move ruby to start trail
        ruby.move();

        while (ruby.canPickThing()) {
            ruby.pickThing();
            if (ruby.countThingsInBackpack() < 7) {
                ruby.move();
            } else {
                break;
            }
        }
        ruby.move();
        while (ruby.canPickThing()) {
            ruby.move();

        }
    }
}
