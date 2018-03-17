import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level extends main
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level()
    {
        prepare();
        int lives = 3;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Score score = new Score();//the current score
        addObject(score,804,575);
        score.setLocation(809,600);
        //
        Miner Life1 = new Miner(); // The Lives (Just Picture) (1)
        addObject(Life1,76,490);
        Life1.setLocation(44,730);

        Miner Life2 = new Miner(); // The Lives (Just Picture) (2)
        addObject(Life2,76,490);
        Life2.setLocation(84,730);

        Miner Life3 = new Miner(); // The Lives (Just Picture) (3)
        addObject(Life3,76,490);
        Life3.setLocation(124,730);
        //
        VerticalBrick verticalbrick = new VerticalBrick();//Walls
        addObject(verticalbrick,28,211);
        VerticalBrick verticalbrick2 = new VerticalBrick();
        addObject(verticalbrick2,799,235);
        verticalbrick2.setLocation(873,206);
        verticalbrick.setLocation(22,204);
        VerticalBrick verticalbrick3 = new VerticalBrick();
        addObject(verticalbrick3,878,311);
        verticalbrick3.setLocation(873,319);
        VerticalBrick verticalbrick4 = new VerticalBrick();
        addObject(verticalbrick4,97,263);
        verticalbrick4.setLocation(22,321);
        //
        Gate gate = new Gate();//Gate To Finish
        addObject(gate,843,492);
        gate.setLocation(837,467);
        //
        Player player = new Player(); //The Moving Player
        addObject(player,85,490);
        player.setLocation(65,462);
        //
    }
}
