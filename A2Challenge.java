
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
public class A2Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City lego = new City();

        //creating walls to form the road
        new Wall(lego, 0, 0, Direction.WEST);
        new Wall(lego, 1, 0, Direction.WEST);
        new Wall(lego, 2, 0, Direction.WEST);
        new Wall(lego, 3, 0, Direction.WEST);
        new Wall(lego, 4, 0, Direction.WEST);
        new Wall(lego, 5, 0, Direction.WEST);
        new Wall(lego, 6, 0, Direction.WEST);
        new Wall(lego, 7, 0, Direction.WEST);
        new Wall(lego, 8, 0, Direction.WEST);
        new Wall(lego, 9, 0, Direction.WEST);

        new Wall(lego, 9, 1, Direction.EAST);
        new Wall(lego, 8, 1, Direction.EAST);
        new Wall(lego, 7, 1, Direction.EAST);
        new Wall(lego, 6, 1, Direction.EAST);
        new Wall(lego, 7, 1, Direction.EAST);
        new Wall(lego, 6, 1, Direction.EAST);
        new Wall(lego, 5, 1, Direction.EAST);
        new Wall(lego, 4, 1, Direction.EAST);
        new Wall(lego, 3, 1, Direction.EAST);
        new Wall(lego, 2, 1, Direction.EAST);
        new Wall(lego, 1, 1, Direction.EAST);
        new Wall(lego, 0, 1, Direction.EAST);

        //creating walls to form the sidewalk
        new Wall(lego, 9, 2, Direction.SOUTH);
        new Wall(lego, 9, 2, Direction.EAST);

        new Wall(lego, 6, 2, Direction.EAST);
        new Wall(lego, 5, 2, Direction.EAST);

        new Wall(lego, 3, 2, Direction.EAST);

        new Wall(lego, 0, 2, Direction.EAST);

        //creating walls to form the driveways
        new Wall(lego, 8, 3, Direction.SOUTH);
        new Wall(lego, 8, 4, Direction.SOUTH);
        new Wall(lego, 8, 5, Direction.SOUTH);
        new Wall(lego, 8, 6, Direction.SOUTH);
        new Wall(lego, 8, 7, Direction.SOUTH);
        new Wall(lego, 8, 7, Direction.EAST);
        new Wall(lego, 7, 7, Direction.EAST);
        new Wall(lego, 7, 7, Direction.NORTH);
        new Wall(lego, 7, 6, Direction.NORTH);
        new Wall(lego, 7, 5, Direction.NORTH);
        new Wall(lego, 7, 4, Direction.NORTH);
        new Wall(lego, 7, 3, Direction.NORTH);

        new Wall(lego, 4, 3, Direction.SOUTH);
        new Wall(lego, 4, 4, Direction.SOUTH);
        new Wall(lego, 4, 5, Direction.SOUTH);
        new Wall(lego, 4, 5, Direction.EAST);
        new Wall(lego, 4, 3, Direction.NORTH);
        new Wall(lego, 4, 4, Direction.NORTH);
        new Wall(lego, 4, 5, Direction.NORTH);

        new Wall(lego, 2, 3, Direction.SOUTH);
        new Wall(lego, 2, 4, Direction.SOUTH);
        new Wall(lego, 2, 5, Direction.SOUTH);
        new Wall(lego, 2, 6, Direction.SOUTH);
        new Wall(lego, 2, 6, Direction.EAST);
        new Wall(lego, 1, 6, Direction.EAST);
        new Wall(lego, 1, 6, Direction.NORTH);
        new Wall(lego, 1, 5, Direction.NORTH);
        new Wall(lego, 1, 4, Direction.NORTH);
        new Wall(lego, 1, 3, Direction.NORTH);

        //creating the snow in the city on the road
        new Thing(lego, 0, 1);
        new Thing(lego, 1, 0);
        new Thing(lego, 2, 0);
        new Thing(lego, 3, 0);
        new Thing(lego, 3, 1);
        new Thing(lego, 4, 0);
        new Thing(lego, 5, 1);
        new Thing(lego, 7, 0);
        new Thing(lego, 7, 1);
        new Thing(lego, 8, 1);
        new Thing(lego, 9, 0);
        new Thing(lego, 9, 1);
        //creating the snow in the city on the sidewalk
        new Thing(lego, 1, 2);
        new Thing(lego, 2, 2);
        new Thing(lego, 4, 2);
        new Thing(lego, 7, 2);
        //creating the snow in the city on the driveways
        new Thing(lego, 1, 3);
        new Thing(lego, 1, 4);
        new Thing(lego, 1, 5);
        new Thing(lego, 2, 4);
        new Thing(lego, 2, 6);

        new Thing(lego, 4, 3);
        new Thing(lego, 4, 4);

        new Thing(lego, 7, 3);
        new Thing(lego, 8, 3);
        new Thing(lego, 8, 4);
        new Thing(lego, 8, 6);
        new Thing(lego, 7, 7);

        //new robot tina
        Robot tina = new Robot(lego, 0, 2, Direction.SOUTH);
        tina.setLabel("T");

        //new robot ruby
        Robot ruby = new Robot(lego, 0, 2, Direction.SOUTH);
        ruby.setLabel("R");

        //while ruby is on a street number lower than 9
        while (ruby.getStreet() < 9) {
            //if ruby's avenue number is ==2 (on the sidewalk
            if (ruby.getAvenue() == 2) {
                ruby.turnLeft();
                //determine if there is a driveway, by turning to the left and asking if front is clear
                //if front is clear, move onto driveway and clear snow
                if (ruby.frontIsClear()) {
                    ruby.move();

                    if (ruby.frontIsClear()) {
                        while (ruby.canPickThing()) {
                            ruby.pickThing();
                        }
                        ruby.move();

                    } else if (!(ruby.frontIsClear())) {
                        ruby.turnLeft();
                        ruby.turnLeft();
                        ruby.turnLeft();
                    }
                }
                //if front is not clear, turn right, and keep moveing forwards along sidewalk
            } else if (!(ruby.frontIsClear())) {
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.turnLeft();
                ruby.move();
            }
        }


    }
}
