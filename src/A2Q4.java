
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating new city
        City lego = new City();
        //creating walls within city to form the castle
        new Wall(lego, 1, 1, Direction.NORTH);
        new Wall(lego, 1, 1, Direction.EAST);
        new Wall(lego, 1, 1, Direction.WEST);
        new Wall(lego, 1, 1, Direction.SOUTH);

        new Wall(lego, 2, 2, Direction.NORTH);
        new Wall(lego, 2, 3, Direction.NORTH);
        new Wall(lego, 2, 3, Direction.EAST);
        new Wall(lego, 3, 3, Direction.EAST);
        new Wall(lego, 3, 3, Direction.SOUTH);
        new Wall(lego, 3, 2, Direction.SOUTH);
        new Wall(lego, 3, 2, Direction.WEST);
        new Wall(lego, 2, 2, Direction.WEST);

        new Wall(lego, 1, 4, Direction.NORTH);
        new Wall(lego, 1, 4, Direction.EAST);
        new Wall(lego, 1, 4, Direction.SOUTH);
        new Wall(lego, 1, 4, Direction.WEST);

        new Wall(lego, 4, 4, Direction.NORTH);
        new Wall(lego, 4, 4, Direction.EAST);
        new Wall(lego, 4, 4, Direction.SOUTH);
        new Wall(lego, 4, 4, Direction.WEST);

        new Wall(lego, 4, 1, Direction.NORTH);
        new Wall(lego, 4, 1, Direction.EAST);
        new Wall(lego, 4, 1, Direction.SOUTH);
        new Wall(lego, 4, 1, Direction.WEST);

        //creating new robot within the city starting at 0,1 faceing east
        Robot ruby = new Robot(lego, 0, 1, Direction.EAST);
        //the process of makeing the guard go around the castle
        //see if there is a wall beside ruby
        while (true) {
            ruby.turnLeft();
            ruby.turnLeft();
            ruby.turnLeft();
            //if there is no wall to the right of ruby, move
            if (ruby.frontIsClear()) {
                ruby.move();
            }
            //if there is a wall to the right of ruby, turn left
            if (!(ruby.frontIsClear())) {
                ruby.turnLeft();
                //and if the front is clear, move
                if (ruby.frontIsClear()) {
                    ruby.move();
                }
                //if the front is not clear, turn left, then move
                if (!(ruby.frontIsClear())) {
                    ruby.turnLeft();
                    ruby.move();
                }
            }
        }
    }
}
