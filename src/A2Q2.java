
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City lego = new City();
        //new robot
        Robot ruby = new Robot(lego, 3, 1, Direction.EAST);
        //creating race track
        new Wall(lego, 3, 1, Direction.SOUTH);
        new Wall(lego, 3, 2, Direction.SOUTH);
        new Wall(lego, 3, 3, Direction.SOUTH);
        new Wall(lego, 3, 4, Direction.SOUTH);
        new Wall(lego, 3, 5, Direction.SOUTH);
        new Wall(lego, 3, 6, Direction.SOUTH);
        new Wall(lego, 3, 7, Direction.SOUTH);
        new Wall(lego, 3, 8, Direction.SOUTH);
        new Wall(lego, 3, 9, Direction.SOUTH);

        //creating hurdles
        new Wall(lego, 3, 3, Direction.EAST);
        new Wall(lego, 3, 5, Direction.EAST);
        new Wall(lego, 3, 2, Direction.EAST);
        new Wall(lego, 3, 8, Direction.EAST);

        //creating finish line
        new Thing(lego, 3, 9);

        //make karel run the race
while(!(ruby.canPickThing())){
        //if ruby's front is clear, move
        if (ruby.frontIsClear()) {
            ruby.move();
        } else {
            //process of jumping a hurdle
            ruby.turnLeft();
            ruby.move();
            ruby.turnLeft();
            ruby.turnLeft();
            ruby.turnLeft();
            ruby.move();
            ruby.turnLeft();
            ruby.turnLeft();
            ruby.turnLeft();
            ruby.move();
            ruby.turnLeft();
            
            


        }
    }
}
}
